package com.asg8oppsmethods;

//5) Write a program for class and object : (initialization through method)
//Note : Initializing object simply means storing data into object

public class Student5 {

	private int rollNum;
	private String name;
	private int age;
	
	public void initializeMethod(int rollNum, String name, int age) {
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
	System.out.println("Student Details");
	System.out.println("Roll Number : "+rollNum);
	System.out.println("Name        : "+name);
	System.out.println("Age         : "+age);
	}
	
	public static void main(String[] args) {
		

		Student5 s = new Student5();
		
		s.initializeMethod(101, "Pranay", 18);
		
		s.displayDetails();
	}

}
