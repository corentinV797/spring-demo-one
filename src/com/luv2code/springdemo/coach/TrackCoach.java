package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.service.FortuneService;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! " + fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("TrackCoach: doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: doMyCleanupStuff");
	}
}
