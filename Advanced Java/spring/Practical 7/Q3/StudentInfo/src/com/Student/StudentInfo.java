package com.Student;

public class StudentInfo {
	String name;
	String rollNo;
	String std;
	Address address;
	
	public String getName() {
		return name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getStd() {
		return std;
	}

	public Address getAddress() {
		return address;
	}

	public StudentInfo(String name, String rollNo, String std, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.std = std;
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", rollNo=" + rollNo + ", std=" + std + ", address=[" + address.getCity() + ", " + address.getState() + "]]";
	}
}
