package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp2 {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TestConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("poolCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
//		// call methods to get new fields
//		System.out.println(theCoach.getEmail());
//		System.out.println(theCoach.getTeam());
//		
		// close the context
		context.close();
	}

}
