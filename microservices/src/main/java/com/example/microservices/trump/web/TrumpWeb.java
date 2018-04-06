package com.example.microservices.trump.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.trump.logic.TrumpLogicManager;

@CrossOrigin
@RestController
public class TrumpWeb {
	
	TrumpLogicManager manager = new TrumpLogicManager();
	
	

	@RequestMapping("/trump")
	@ResponseBody
	ResponseEntity<String> trump() {
		ResponseEntity<String> result = manager.getImageUrl();
		//TrumpWebResult trumpRes = new TrumpWebResult();
		//trumpRes.setApiUrl(result);
		return result;
	}
}
