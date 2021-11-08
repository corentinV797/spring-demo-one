package com.luv2code.springdemo.app;

import com.luv2code.springdemo.coach.Coach;
import com.luv2code.springdemo.coach.TrackCoach;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkOut());
	}

}
