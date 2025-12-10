package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopConfig.xml");
		
		CustomerService cs = (CustomerService) context.getBean("customer");
		
		cs.createCustomer();
		cs.CustomerDeleted();
		
		LoggingAspect la = (LoggingAspect) context.getBean("logging");
		la.beforeAdvice();
		la.afterAdvice();
		
		
	}

}
