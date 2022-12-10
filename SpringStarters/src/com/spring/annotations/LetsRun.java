package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LetsRun {
	
	public static void main(String[] args) {
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		
		//get the bean from the spring container
		Thought scaryThought = context.getBean("scaryThought", Thought.class);
		
		System.out.println(scaryThought.getCurrentThought());
		System.out.println(scaryThought.getCurrentEnvironment());
		
	}

}
