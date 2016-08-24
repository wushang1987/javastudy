package com.annotation.test;

public class Test {

	@SuppressWarnings("deprecation")
	public void sing() {
		Person person = new Child();
		person.sing();
		
		person.name();
	}
	
}
