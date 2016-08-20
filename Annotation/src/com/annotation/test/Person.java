package com.annotation.test;

public interface Person {
	public String name();
	public int age();
	
	@Deprecated
	public void sing();
	
	public String word(String overWord);
}
