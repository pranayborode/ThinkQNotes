package com.asg9SetHW;

import java.util.HashSet;
import java.util.Objects;

//3.WAP to add user defined objects of type Employee in a HashSet. Print the contents in the Set.

class Employee {

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
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class Q3UserDefineObject {

	public static void main(String[] args) {

		HashSet<Employee> empSet = new HashSet<>();

		empSet.add(new Employee(101, "Milind"));
		empSet.add(new Employee(102, "Utkarsh"));
		empSet.add(new Employee(103, "Mukul"));

		for (Employee e : empSet) {
			System.out.println(e);
		}

	}

}
