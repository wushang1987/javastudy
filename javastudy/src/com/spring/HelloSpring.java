package com.spring;

public class HelloSpring {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		System.out.print("your Message:"+message);
		return message;
	}
}
