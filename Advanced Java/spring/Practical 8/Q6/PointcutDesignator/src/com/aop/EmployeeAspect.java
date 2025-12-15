package com.aop;


//This class contains the methods that will run BEFORE/AFTER your main methods.
//These methods are called "advices" in Spring AOP.

public class EmployeeAspect {
	
    // This advice will run before any method that matches the "execution" pointcut
	public void executionAdvice() {
		System.out.println("[execution] Method executed");
	}
	
    // This advice would run when the method is inside a specific package (if configured)
	public void withinAdvice() {
		System.out.println("[within] Method inside service package executed");
	}
	
    // This advice would run when a method has a String parameter (if configured)
	public void argsAdvice() {
		System.out.println("[args] Method with String argument executed");
	}
	
    // Runs for proxy-based AOP calls (if configured)
	public void thisAdvice() {
		System.out.println("[this] Proxy-based method executed");
	}
	
	// Runs for target object calls (if configured)
	public void targetAdvice() {
		System.out.println("[target] Target Object method executed");
	}
	
	// Runs when a bean name matches a pointcut (if configured)
	public void beanAdvice() {
		System.out.println("[bean] Bean name matched");
	}
}
