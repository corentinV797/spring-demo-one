package com.luv2code.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coach.Coach;

public class RandomFortuneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach golfCoach = context.getBean("myGolfCoach", Coach.class);
		System.out.println(golfCoach.getDailyFortune());
		context.close();
	}

}
