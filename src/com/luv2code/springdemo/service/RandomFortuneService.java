package com.luv2code.springdemo.service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Be careful today", "love is in the air", "don't kill people"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
