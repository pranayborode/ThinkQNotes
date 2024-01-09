package com.assignment22arrayofobject;

import java.util.Scanner;

class Employee3 {
	private int empNo;
	private String name;

	public Employee3(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Q6EmployeeArray {

	public static void createArrayofEmp(Employee3 emp[]) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < emp.length; i++) {

			System.out.println("Enter details for Employee : " + (i + 1));

			System.out.println("Enter Employee No:");
			int empNo = sc.nextInt();

			System.out.println("Enter Employee Name:");
			String ename = sc.next();

			emp[i] = new Employee3(empNo, ename);

		}

		for (Employee3 e : emp) {
			System.out.println("Employee No: " + e.getEmpNo() + ", Name: " + e.getName());
		}

	}

	public static void main(String[] args) {

		Employee3 emp[] = new Employee3[5];

		createArrayofEmp(emp);

	}

}
