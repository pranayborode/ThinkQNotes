package com.asg5CollectionVector;

import java.util.Iterator;
import java.util.Vector;

//99. Create vector of employee objects. Delete employee object if salary of employee is < 5000
public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		Vector<Employee> empVector = new Vector<>();
		
		empVector.add(new Employee(101,"Rahul", 7000));
		empVector.add(new Employee(102,"Shital", 4000));
		empVector.add(new Employee(103,"Gaurav", 10000));
		empVector.add(new Employee(104,"Amit", 3000));
		empVector.add(new Employee(105,"Joy", 20000));
		empVector.add(new Employee(106,"Priya", 7000));
		
		
		Iterator<Employee> e = empVector.iterator();
		
		while(e.hasNext()) {
			if(e.next().getSalary()<5000) {
				e.remove();
			}
		}
		
		for(Employee e1 : empVector) {
			System.out.println(e1);
		}
		
		
	}

}
