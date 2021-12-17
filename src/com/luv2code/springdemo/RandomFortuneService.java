package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of Strings
	private String[] dataStrings = {
			"string1",
			"string2",
			"string3"
	};
	
	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		int index =  myRandom.nextInt(dataStrings.length);
		return dataStrings[index];
	}

}
