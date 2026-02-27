package com.aop;


//This is your business method.
// Spring AOP will monitor this method because of the pointcut defined in XML.
public class PaymentService {
	public void makePayment(int amount) {
		
		// Normal output
		System.out.println("Proccessing payment...");
		
		// If amount is negative, we throw an exception
        // This will trigger the AFTER THROWING advice in the Aspect
		if (amount < 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}
		
		// This only runs if no exception occurs
		System.out.println("Payment successful!");
	}
}
