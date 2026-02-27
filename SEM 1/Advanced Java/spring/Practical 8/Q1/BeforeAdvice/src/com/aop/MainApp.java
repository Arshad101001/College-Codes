package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopConfig.xml");
		
		CustomerService cs = (CustomerService) context.getBean("customer");
		
		// after creating object when you call its methods then the AOP aspect will trigger and first it will run aop:before then it will execute objects method
		cs.createCustomer();
		cs.CustomerDeleted();
		
		
	}

}
