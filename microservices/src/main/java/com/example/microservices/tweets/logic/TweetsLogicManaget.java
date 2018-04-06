package com.example.microservices.tweets.logic;

import java.util.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public class TweetsLogicManaget {
	
	private String apikey = "QBz1LovHvGVgZSyVRPCopquJR";
	private String apiSecretKey = "Hsn80lHNgpsKXKvKnCojn1JJ29GuHXMVmo3CVpJLXjEFn97jKB";
	
	
	private String parseToken(String body) {
		int startIndex = body.indexOf("access_token") + "access_token".length() + 3;
		String token = body.substring(startIndex, startIndex + 112);
		
		return token;
		
	}
	
	public ResponseEntity<String> getTweets() {
		
		//create bearer token with twitter api keys
		String keys = apikey + ":" + apiSecretKey;
		byte[] encoded = Base64.getEncoder().encode(keys.getBytes());
		String bearer = new String(encoded);
		
		//request body
		MultiValueMap<String,String> body = new LinkedMultiValueMap<String,String>();
		body.add("grant_type", "client_credentials");
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + bearer);
		
		HttpEntity<?> request = new HttpEntity<Object>(body, headers);
		
		String apiUrl = "https://api.twitter.com/oauth2/token";
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.exchange(apiUrl, HttpMethod.POST, request, String.class);
		
		String respBody = response.getBody();
		if (respBody.length() < 112) {
			return (ResponseEntity<String>) response.badRequest();
		}
		
		String token = parseToken(respBody);
		
		HttpHeaders tweetHeaders = new HttpHeaders();
		tweetHeaders.add("Authorization", "Bearer " + token);
		String tweetUrl = "https://api.twitter.com/1.1/statuses/user_timeline.json?count=30&tweet_mode=extended&screen_name=realdonaldtrump";
		HttpEntity<?> tweetRequest = new HttpEntity<Object>(tweetHeaders);
		RestTemplate tweetRest = new RestTemplate();
		ResponseEntity<String> tweetResponse = tweetRest.exchange(tweetUrl, HttpMethod.GET,tweetRequest, String.class);
		
		return tweetResponse;
}

	
}
