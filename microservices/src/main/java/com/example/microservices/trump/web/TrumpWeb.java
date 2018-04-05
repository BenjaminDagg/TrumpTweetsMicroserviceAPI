package com.example.microservices.trump.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrumpWeb {

	@RequestMapping("/trump")
	@ResponseBody
	TrumpWebResult trump() {
		TrumpWebResult trumpRes = new TrumpWebResult();
		trumpRes.setId("1");
		trumpRes.setName("trump");
		return trumpRes;
	}
}
