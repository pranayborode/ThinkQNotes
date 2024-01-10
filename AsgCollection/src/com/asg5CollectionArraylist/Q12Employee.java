package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Collections;

//12. Sort arraylist of employees on employee names using comparable interface. 

public class Q12Employee implements Comparable<Q12Employee>{

	private int id;
	private String name;

	public Q12Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q12Employee(int id, String name) {
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

	@Override
	public String toString() {
		return "Q12Employee [id=" + id + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public int compareTo(Q12Employee e) {
		
		return this.name.compareTo(e.getName());
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		ArrayList<Q12Employee> stringList = new ArrayList<>();

	
		stringList.add(new Q12Employee(2, "Ron"));
		stringList.add(new Q12Employee(1, "Priya"));
		stringList.add(new Q12Employee(4, "Rohit"));
		stringList.add(new Q12Employee(3, "Amit"));
		stringList.add(new Q12Employee(5, "Shital"));
		
		System.out.println("ArrayList before sorting: ");
		for(Q12Employee e : stringList) {
			System.out.println(e);
		}
		
		Collections.sort(stringList);
		
		System.out.println("ArrayList after sorting: ");
		for(Q12Employee e : stringList) {
			System.out.println(e);
		}
	}

	

}
