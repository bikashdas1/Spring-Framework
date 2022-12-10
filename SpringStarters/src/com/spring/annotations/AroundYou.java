package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class AroundYou {

	public String getEnvironmentCondition() {
		return "It's pitch black in the room";
	}
	
}
