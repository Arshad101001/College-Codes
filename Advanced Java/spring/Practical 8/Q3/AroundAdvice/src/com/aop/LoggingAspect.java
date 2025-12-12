package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	// aopConfig class will call it by passing a pjp, which contains Method reference, Method name, Method argument 
	public Object arroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Advice: Before Method ");	// it will execute before actual method
		long start = System.currentTimeMillis();	// it records the time like when the code executed
		
		// proceeding to actual method
		 pjp.proceed();		// calling or running actual method
		Object result = pjp.proceed(new Object[] {"Raju Khatmal"});		// modifying the actual method call
		
		
		long end = System.currentTimeMillis();	// it records at what time the code executed
		System.out.println("Around Advice: After Method ");		// it will execute after actual method
		
		System.out.println("Execution time : " + (end - start) + "ms");		// it will return time taken for method execution
		return result;
	}
}
