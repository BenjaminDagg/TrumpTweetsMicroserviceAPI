package com.example.microservices.tweets.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetWeb {

	@RequestMapping("/tweets")
	@ResponseBody
	TweetWebResult tweets() {
		TweetWebResult tweetRes = new TweetWebResult();
		
		tweetRes.setUrl("stub.url");
		return tweetRes;
	}
}
