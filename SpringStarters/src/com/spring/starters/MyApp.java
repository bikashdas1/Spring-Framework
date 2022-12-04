package com.spring.starters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketRoutine cricketRoutine = context.getBean("cricketRoutineBean", CricketRoutine.class);
		CricketRoutine cricketRoutine2 = context.getBean("cricketRoutineBean", CricketRoutine.class);
		Routine footballRoutine = context.getBean("footballRoutineBean", Routine.class);
		
		System.out.println(cricketRoutine.getDailyWorkout());
		System.out.println(cricketRoutine.getReplenishment());
		System.out.println(footballRoutine.getDailyWorkout());
		System.out.println(footballRoutine.getReplenishment());
		
		System.out.println(cricketRoutine.getDayRoutine());
		System.out.println(cricketRoutine.getEnergyRequired());
		
		context.close();
		
		System.out.println(cricketRoutine + " " + cricketRoutine2);
		System.out.println(cricketRoutine == cricketRoutine2);
	}
	
}
