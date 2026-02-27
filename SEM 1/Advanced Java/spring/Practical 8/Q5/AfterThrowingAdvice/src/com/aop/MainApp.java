package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		// Load Spring configuration file
        // This loads the beans and also sets up AOP proxy objects
		ApplicationContext context = new ClassPathXmlApplicationContext("aopConfig.xml");
		
		// Getting the paymentService bean from Spring container
        // IMPORTANT: Spring returns a PROXY object here, not the real object
		PaymentService ps = (PaymentService) context.getBean("paymentService");
		
		
		try {
			// Calling the method with a positive value
            // This wont cause any exception
			ps.makePayment(100);
			
			System.out.println("---------------------");
			
			// Calling the method with a negative value
            // This will cause an exception intentionally
			ps.makePayment(-100);
		} catch (Exception e) {
			
			// This will run AFTER the aspect logs the exception
			System.out.println("Error handled in main method: ");
		}

	}

}
