package com.aop;

// This class acts as an Aspect.
// It contains code that will run AFTER a method successfully returns a value.
public class AspectClass {
	
	// This method will be executed ONLY when the target method completes successfully
    // (i.e., no exception is thrown).
    //
    // Spring will automatically pass the returned value from the target method
    // into the 'returnValue' parameter.
	
	public void afterReturningAdvice(Object returnValue) {
		
		System.out.println("After returning Advice Executed");
		
		// This prints the actual returned value of the target method.
		// In this example, UserService returns "Successful", so that is what gets printed.
		System.out.println("Returned Value " + returnValue);
	}
}
