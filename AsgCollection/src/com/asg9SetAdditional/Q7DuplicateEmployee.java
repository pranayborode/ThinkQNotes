package com.asg9SetAdditional;

import java.util.TreeSet;

//7.	WAP to add user defined objects of type Employee in a TreeSet using duplicate Employee object.
class Employees implements Comparable<Employees> {

	private int id;
	private String name;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int id, String name) {
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
		return "Employees [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employees o) {

		return Integer.compare(this.id, o.id);
	}

}

public class Q7DuplicateEmployee {

	public static void main(String[] args) {

		TreeSet<Employee> empSet = new TreeSet<>();

		empSet.add(new Employee(103, "Praful"));
		empSet.add(new Employee(101, "Gaurav"));
		empSet.add(new Employee(102, "Riya"));

		for (Employee e : empSet) {
			System.out.println(e);
		}

		System.out.println("-------------------------------------");
		empSet.add(new Employee(101, "Shital"));

		for (Employee e : empSet) {
			System.out.println(e);
		}
	}

}
