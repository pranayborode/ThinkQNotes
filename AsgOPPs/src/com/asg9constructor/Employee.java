package com.asg9constructor;

public class Employee {

	private int emp_id;
	private String name;
	private int sal;
	
	public Employee() {
		setEmp_id(101);
		setName("Pravin");
		setSal(12000);
	}

	public Employee(int emp_id,String name,int sal) {
		this.emp_id = emp_id;
		this.name = name;
		this.sal = sal;
	}
	
	public void display() {
		System.out.println("Employee Id : "+emp_id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+sal);
	}
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();
		
		System.out.println("------------------");
		
		Employee e2 = new Employee(222, "Arnav", 33000);
		e2.display();
	}

}
