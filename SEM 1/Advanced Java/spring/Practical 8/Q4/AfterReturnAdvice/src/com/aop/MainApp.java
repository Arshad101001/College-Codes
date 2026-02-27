package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		// Loading the Spring configuration file.
        // This sets up beans and also prepares AOP proxy objects.
		ApplicationContext context = new ClassPathXmlApplicationContext("aopConfig.xml");
		
		// Getting the userService bean.
        // IMPORTANT: Spring actually returns a proxy object, not the original.
		UserService service = (UserService) context.getBean("userService");
		
		// Calling the business method.
        // 1. This prints "Hello Raj!" from UserService
        // 2. AFTER RETURNING advice runs from AspectClass
        // 3. The method returns "Successful", which is printed here
		System.out.println(service.welcomeMessage("Raj")); 	// it will also print successful as the welcomeMessage is returning it
		

	}

}
