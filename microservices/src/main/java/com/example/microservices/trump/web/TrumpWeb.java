package com.example.microservices.trump.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.trump.logic.TrumpLogicManager;

@RestController
public class TrumpWeb {
	
	TrumpLogicManager manager = new TrumpLogicManager();
	
	

	@RequestMapping("/trump")
	@ResponseBody
	TrumpWebResult trump() {
		String result = manager.getImageUrl();
		TrumpWebResult trumpRes = new TrumpWebResult();
		trumpRes.setApiUrl(result);
		return trumpRes;
	}
}
