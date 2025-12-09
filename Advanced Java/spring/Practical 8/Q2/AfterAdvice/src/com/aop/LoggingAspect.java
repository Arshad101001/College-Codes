package com.aop;

public class LoggingAspect {
	public void beforeAdvice() {
		System.out.println("Before execution of business method");
	}
	
	public void afterAdvice() {
		System.out.println("After execution of business method");
	}
}
