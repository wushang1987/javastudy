package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
		
		obj.getMessage();
	}

}