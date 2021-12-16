package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Running for 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
