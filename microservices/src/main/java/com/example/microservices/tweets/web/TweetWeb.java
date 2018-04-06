package com.example.microservices.tweets.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.tweets.logic.TweetsLogicManaget;

@RestController
public class TweetWeb {
	
	
	
	TweetsLogicManaget manager = new TweetsLogicManaget();

	@RequestMapping("/tweets")
	@ResponseBody
	ResponseEntity<String> tweets() {
		ResponseEntity<String> res = manager.getTweets();
		
		return res;
	}
}
