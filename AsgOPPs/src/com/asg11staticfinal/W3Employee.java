package com.asg11staticfinal;

//3.	Write another same Employee class to implement auto-generation of employee_id.

public class W3Employee {
	
	private int employee_id;
	private String name;
	private double salary;
	private static int totalEmployees = 0;
	private static int employeeCounter = 1000;
	

	public W3Employee(String name, double salary) {
		this.employee_id = generateEmployeeId();
		this.name = name;
		this.salary = salary;
		totalEmployees++;
	}

	private int generateEmployeeId() {
		return ++employeeCounter;
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
		
		W3Employee e1 = new W3Employee("Amar", 25000);
		W3Employee e2 = new W3Employee("Saurabh", 45800);
		W3Employee e3 = new W3Employee("Rohit", 102000);
		W3Employee e4 = new W3Employee("Mayuri", 54000);
		W3Employee e5 = new W3Employee("Riya", 39000);
		
		e1.displayInfo();
		e2.displayInfo();
		e3.displayInfo();
		e4.displayInfo();
		e5.displayInfo();
		
		System.out.println("Total Number of Employee : "+W3Employee.totalEmployees);
		

		
	}

}
