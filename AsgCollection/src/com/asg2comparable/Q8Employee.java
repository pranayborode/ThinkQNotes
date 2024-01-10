package com.asg2comparable;

import java.util.ArrayList;
import java.util.Collections;


//8. Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using 
//   Collections.sort(list) based on name. If name are same then sort on id. Print arrayList.

public class Q8Employee implements Comparable<Q8Employee>{
	private int id;
	private String name;
	private String designation;
	private int age;

	public Q8Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q8Employee(int id, String name, String designation, int age) {
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
		ArrayList<Q8Employee> empList = new ArrayList<>();
		
		empList.add(new Q8Employee(102, "Raju", "Manager", 38));
		empList.add(new Q8Employee(101, "Purva", "HR", 38));
		empList.add(new Q8Employee());
		empList.add(new Q8Employee(103, "Amit", "TeamLead", 38));
		
		
		for(Q8Employee e : empList) {
			System.out.println(e);
		}
		
		Collections.sort(empList);
		System.out.println("______________After sorting______________");
		for(Q8Employee e : empList) {
			System.out.println(e);
		}

	}

	

	@Override
	public int compareTo(Q8Employee e) {
		if(this.getName().compareTo(e.getName())==0) {
			return Integer.compare(this.id, e.getId());
		}else if (this.getName().compareTo(e.getName())>1) {
			return 1;
		}
		return -1;
	}
	

}
