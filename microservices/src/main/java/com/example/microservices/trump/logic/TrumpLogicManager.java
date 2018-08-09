package com.example.microservices.trump.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TrumpLogicManager {
	@Value("${trumpApiUrl}")
	private String trumpApiUrl;
	@Value("${trumpApiKey}")
	private String trumpApiKey;
	@Value("${trumpApiTags}")
	private String trumpApiTags;
	
	
	public ResponseEntity<String> getImageUrl() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Api-Key", "ah3677qn6rfhesdjud9kmtsc");
		headers.add("Access-Control-Allow-Origin", "*");
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		String apiUrl = "https://api.gettyimages.com/v3/search/images?fields=id,title,comp,referral_destinations&sort_order=best&phrase=trump";
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.exchange(apiUrl, HttpMethod.GET, request, String.class);
		
		
		return  response;
	}
}
