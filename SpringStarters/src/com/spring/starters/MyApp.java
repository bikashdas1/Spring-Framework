package com.spring.starters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Routine cricketRoutine = context.getBean("cricketRoutineBean", Routine.class);
		Routine footballRoutine = context.getBean("footballRoutineBean", Routine.class);
		
		System.out.println(cricketRoutine.getDailyWorkout());
		System.out.println(cricketRoutine.getReplenishment());
		System.out.println(footballRoutine.getDailyWorkout());
		System.out.println(footballRoutine.getReplenishment());
		
		System.out.println(cricketRoutine.getDayRoutine());
		System.out.println(cricketRoutine.getEnergyRequired())   ;
		
	}
	
}
