package com.asg9SetAdditional;

import java.util.TreeSet;

//9.	WAP to add user defined objects of type Employee which now implements 

//Comparable interface in a TreeSet. Print the contents in the Set. 
//Add duplicate Employee object and print the contents in theSet. Observe the values.

class Employeee implements Comparable<Employeee> {
	private int id;
	private String name;

	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employeee(int id, String name) {
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
		return "Employeee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employeee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}

}

public class Q9EmployeeImplementsComparable {

	public static void main(String[] args) {
		
		TreeSet<Employeee> treeSet = new TreeSet<>();
		
		treeSet.add(new Employeee(103, "Aditya"));
		treeSet.add(new Employeee(101, "Arru"));
		treeSet.add(new Employeee(102, "Shreya"));
		

		System.out.println(treeSet);
		
		treeSet.add(new Employeee(101, "Pritesh"));
		
		System.out.println(treeSet);
	}

}
