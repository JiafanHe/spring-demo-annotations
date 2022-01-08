package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService newFortuneService() {
		return new NewFortuneService();
	}
	
	// define bean for our swim coach and inject dependency\
	@Bean
	public Coach poolCoach() {
		return new PoolCoach(newFortuneService());
	}
}
