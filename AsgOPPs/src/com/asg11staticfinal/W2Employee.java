package com.asg11staticfinal;

/*
2.	Write Employee Class with attributes like employee_id, name, and salary. 
Create parameterized constructor to initialize this 3 attributes, and write a method to display 
this information of 5 objects, display total no of employees using static method, totalEmp(), 
which will return total no of employees.*/

public class W2Employee {
	
	private int employee_id;
	private String name;
	private double salary;
	private static int totalEmployees = 0;
	
	public W2Employee() {
		
	}

	public W2Employee(int employee_id, String name, double salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.salary = salary;
		totalEmployees++;
	}

	public void displayInfo() {
		System.out.println("Employee Id : "+employee_id);
		System.out.println("Name        : "+name);
		System.out.println("Salary      : "+salary);
		System.out.println("----------------------------------------");
	}

	public static int totalEmp() {
		return totalEmployees;
	}

	public static void main(String[] args) {
		
		W2Employee e1 = new W2Employee(101, "Amar", 25000);
		W2Employee e2 = new W2Employee(102, "Saurabh", 45800);
		W2Employee e3 = new W2Employee(103, "Rohit", 102000);
		W2Employee e4 = new W2Employee(104, "Mayuri", 54000);
		W2Employee e5 = new W2Employee(105, "Riya", 39000);
		
		e1.displayInfo();
		e2.displayInfo();
		e3.displayInfo();
		e4.displayInfo();
		e5.displayInfo();
		
		System.out.println("Total Number of Employee : "+W2Employee.totalEmployees);
		

		
	}

}
