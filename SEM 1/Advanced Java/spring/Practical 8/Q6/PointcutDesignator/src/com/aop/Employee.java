package com.aop;

//This is your main business logic class (the target class).
//AOP will apply advices to the methods in this class.
public class Employee {
	
    // A simple method that adds a new employee
	public void addEmployee() {
		System.out.println("Employee added!");
	}
	
    // A method that updates an employee's name
	public void updateEmployee(String name) {
		System.out.println("Employee updated: " + name);
	}
	
    // A method that returns information about an employee
	public String getEmployee() {
		return "Employee Info";
	}
}
