package com.example.microservices.trump.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrumpWeb {
	
	@Value("${trumpApiUrl:default.trump.url}")
	private String trumpApiUrl;
	
	@Value("${trumpApiKey:123456}")
	private String trumpApiKey;

	@RequestMapping("/trump")
	@ResponseBody
	TrumpWebResult trump() {
		TrumpWebResult trumpRes = new TrumpWebResult();
		trumpRes.setApiUrl(trumpApiUrl);
		return trumpRes;
	}
}
