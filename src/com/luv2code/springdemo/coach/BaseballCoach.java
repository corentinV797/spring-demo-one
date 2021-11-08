package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.service.FortuneService;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println("BaseballCoach: inside no-arg constructor");
	}
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Do 10 batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
