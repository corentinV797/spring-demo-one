package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.service.FortuneService;

public class GolfCoach implements Coach {
	private FortuneService fortuneService;
	public GolfCoach() {}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "15 swings";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
