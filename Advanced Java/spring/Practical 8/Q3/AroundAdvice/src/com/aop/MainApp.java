package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopConfig.xml");
		WelcomeService service = (WelcomeService) context.getBean("myService");
		
		service.sayHello("Manoj Mauga");
		System.out.println("--------------------------");
		service.sayHello("Raj");

	}

}
