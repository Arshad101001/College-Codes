package com.aop;


//This class is an Aspect (a separate module of code that runs during certain events)
//Here, it runs only when a method throws an exception.
public class ExceptionAspect {
	
	// This method is triggered ONLY when the target method throws an exception.
    // The parameter 'ex' will contain the exception thrown by the business method.
	public void logException(Exception ex) {
		
		// This will run automatically after an exception is thrown.
		System.out.println("Exception caught in After Throwing Advice: " + ex.getMessage());
	}
}
