package com.luv2code.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coach.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
