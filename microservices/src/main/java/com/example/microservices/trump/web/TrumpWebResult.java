package com.example.microservices.trump.web;

public class TrumpWebResult {
	
	private String apiUrl;
	private String oAuthToken;
	
	

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getoAuthToken() {
		return oAuthToken;
	}

	public void setoAuthToken(String oAuthToken) {
		this.oAuthToken = oAuthToken;
	}
}
