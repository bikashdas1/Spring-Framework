package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScaryThought implements Thought {

	AroundYou aroundYou;
	
//	@Autowired
//	ScaryThought(AroundYou aroundYou) {
//		this.aroundYou = aroundYou;
//	}
	
	ScaryThought() {
		System.out.println("Inside the default constructor");
	}
	
	@Override
	public String getCurrentThought() {
		return "There's something under my bed";
	}

	@Override
	public String getCurrentEnvironment() {
		return aroundYou.getEnvironmentCondition();
	}
	
	@Autowired
	public void setAroundYou(AroundYou aroundYou) {
		this.aroundYou = aroundYou;
	}
	
}
