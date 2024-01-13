package com.asg14containment;

public class EmployeeExample {

	public static void main(String[] args) {

		MyDate date = new MyDate(14, 11, 2023);

		Dept dept = new Dept(101, "IT");

		Employee employee = new Employee(1, "Pranay", 50000.0, dept, date);
		
		System.out.println(employee);
	}

}
