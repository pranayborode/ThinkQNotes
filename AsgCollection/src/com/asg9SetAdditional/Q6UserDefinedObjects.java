package com.asg9SetAdditional;


import java.util.TreeSet;

//6.	WAP to add user defined objects of type Employee in a TreeSet. Print the contents in the Set.

class Employee implements Comparable<Employee> {

	private int id;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.id, o.id);
	}

}

public class Q6UserDefinedObjects {

	public static void main(String[] args) {
		
		TreeSet<Employee> empSet = new TreeSet<>();
		
		empSet.add(new Employee(103, "Praful"));
		empSet.add(new Employee(101, "Gaurav"));
		empSet.add(new Employee(102, "Riya"));
		
		for(Employee e: empSet) {
			System.out.println(e);
		}

	}

}
