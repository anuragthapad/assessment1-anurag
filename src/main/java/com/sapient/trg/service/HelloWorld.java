package com.sapient.trg.service;

public class HelloWorld {
	private String message;
	
	public HelloWorld() {
		
	}

	public HelloWorld(String message) {
		super();
		if(message==null) {
			throw new IllegalArgumentException("Message cannot be NULL");
		}
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
