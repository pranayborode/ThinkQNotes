package com.asg14containment;

public class Employee {

	private int id;
    private String name;
    private double salary;
    private Dept dept;
    private MyDate myDate;
    
    public Employee() {
		
	}

	public Employee(int id, String name, double salary, Dept dept, MyDate myDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.myDate = myDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public MyDate getMyDate() {
		return myDate;
	}

	public void setMyDate(MyDate myDate) {
		this.myDate = myDate;
	}

	
	public String toString() {
		return "Employee : Id - " + id + ", Name - " + name + ", Salary - " + salary + ",\n" + dept + ",\n" + myDate;
	}
	
	
}
