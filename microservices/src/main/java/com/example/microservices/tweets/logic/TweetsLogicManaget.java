package com.example.microservices.tweets.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TweetsLogicManaget {
	
	@Value("${tweetApiUrl:}")
	private String tweetApiUrl;
	@Value("${tweetApiKey:}")
	private String tweetApiKey;
	@Value("${tweetApiTags:}")
	private String tweetApiTags;

	
}
