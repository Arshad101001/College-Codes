package com.aop;

public class UserService {
	
	// This is a simple business method.
    // Spring AOP will monitor this method because of our pointcut.
	public String welcomeMessage(String name) {
		
		// This message is printed from the business method itself.
		System.out.println("Hello " + name + "!");
		
		// Returning a value here will trigger the AFTER RETURNING advice,
        // because the method completed without any errors.
		return "Successful";
	}
}
