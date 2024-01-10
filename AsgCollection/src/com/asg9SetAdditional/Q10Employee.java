package com.asg9SetAdditional;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

//10.  WAP to create a TreeSet and add user defined objects of type Employee 
//    (Employee is implementingComparable interface in natural order). 
//    But use a Comparator which sorts in reverse order. Print thecontents and observe the order of elements.

public class Q10Employee implements Comparable<Q10Employee> {

	private int id;
	private String name;

	public Q10Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q10Employee(int id, String name) {
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
		return "Q10Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Q10Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}

	public static void main(String[] args) {

		TreeSet<Employeee> treeSet = new TreeSet<>(Collections.reverseOrder());

		treeSet.add(new Employeee(103, "Aditya"));
		treeSet.add(new Employeee(101, "Arru"));
		treeSet.add(new Employeee(102, "Shreya"));

		System.out.println(treeSet);

	}

}
