package com.asg2comparable;

import java.util.ArrayList;
import java.util.Collections;

//3. WAP to create a class Employee with (name, designation and age).Now create and add Employee 
//objects elements to Arraylist. Print ArrayList.

public class Q3Employee {
	private int id;
	private String name;
	private String designation;
	private int age;

	public Q3Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q3Employee(int id, String name, String designation, int age) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Q3Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q3Employee> empList = new ArrayList<>();

		empList.add(new Q3Employee(102, "Raju", "Manager", 38));
		empList.add(new Q3Employee(101, "Purva", "HR", 38));
		empList.add(new Q3Employee(103, "Amit", "TeamLead", 38));

		for (Q3Employee e : empList) {
			System.out.println(e);
		}

	}

}
