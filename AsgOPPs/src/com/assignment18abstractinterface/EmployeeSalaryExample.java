package com.assignment18abstractinterface;

abstract class Employee {

	private String name;
	private int id;
	private double hoursWorked;

	public Employee(String name, int id, double hoursWorked) {
		super();
		this.name = name;
		this.id = id;
		this.hoursWorked = hoursWorked;
	}

	abstract void calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}

class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String name, int id, double hoursWorked) {
		super(name, id, hoursWorked);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {

		System.out.println("Salary of PartTimeEmployee " + getName() + " is " + getHoursWorked() * 200);

	}

}

class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name, int id, double hoursWorked) {
		super(name, id, hoursWorked);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {

		System.out.println("Salary of FullTimeEmployee " + getName() + " is " + getHoursWorked() * 500);

	}

}

public class EmployeeSalaryExample {

	public static void main(String[] args) {

		Employee e;

		e = new PartTimeEmployee("Ramesh", 101, 4);
		e.calculateSalary();

		e = new FullTimeEmployee("Rajendra", 102, 8);
		e.calculateSalary();

	}

}
