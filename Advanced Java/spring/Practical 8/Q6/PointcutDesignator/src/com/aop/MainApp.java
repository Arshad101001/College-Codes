package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
        // Load the Spring configuration file (aopConfig.xml)
		ApplicationContext context = new ClassPathXmlApplicationContext("aopConfig.xml");
		
		// Get the Employee bean from Spring container
        // Since AOP is applied, this bean will be a "proxy"
		Employee emp1 = (Employee) context.getBean("employeeService");
		
		System.out.println("\n--- Calling addEmployee() ---");
		emp1.addEmployee();  // execution, within, this, target, bean

		System.out.println("\n--- Calling updateEmployee(\"John\") ---");
        emp1.updateEmployee("John"); // execution, within, args, this, target, bean
        
        System.out.println("\n--- Calling getEmployee() ---");
        String info = emp1.getEmployee();  // execution, within, this, target, bean
        System.out.println("Returned: " + info);
	}

}
