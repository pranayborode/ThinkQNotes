package com.asg9SetHW;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

//6. WAP to add user defined objects of type Employee which now implements 
//   Comparable interface in a HashSet. Print the contents in the Set. 
//   Add duplicate Employee object and print the contents in theSet. Observe the values.

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
	public int compareTo(Employees e) {

		return Integer.compare(this.id, e.getId());

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
		Employees other = (Employees) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	
}

public class Q6EmployeeComparableInterfacce {

	public static void main(String[] args) {

		HashSet<Employees> empSet = new HashSet<>();

		empSet.add(new Employees(101, "Milind"));
		empSet.add(new Employees(102, "Utkarsh"));
		empSet.add(new Employees(103, "Mukul"));

		for (Employees e : empSet) {
			System.out.println(e);
		}

		

	}

}
