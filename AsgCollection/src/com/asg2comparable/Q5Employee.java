package com.asg2comparable;

import java.util.ArrayList;
import java.util.Collections;


//5. Now do sorting on id but based on inbuilt compareTo method. Ensure to check 3 null conditions

public class Q5Employee implements Comparable<Q5Employee>{
	private int id;
	private String name;
	private String designation;
	private int age;

	public Q5Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q5Employee(int id, String name, String designation, int age) {
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
		ArrayList<Q5Employee> empList = new ArrayList<>();
		
		empList.add(new Q5Employee(102, "Raju", "Manager", 38));
		empList.add(new Q5Employee(101, "Purva", "HR", 25));
		empList.add(new Q5Employee(103, "Amit", "TeamLead", 27));
		empList.add(new Q5Employee(106, "Raju", "Employee", 31));
		empList.add(new Q5Employee());
		empList.add(new Q5Employee(105, "Ganesh", "Employee", 28));
		
		
		for(Q5Employee e : empList) {
			System.out.println(e);
		}
		
		Collections.sort(empList);
		System.out.println("______________After sorting______________");
		for(Q5Employee e : empList) {
			System.out.println(e);
		}

	}

	@Override
	public int compareTo(Q5Employee e) {
		if(this.getId()==e.getId()) {
			return 0;
		}else if (this.getId()>e.getId()) {
			return 1;
		}
		return -1;
	}

	

}
