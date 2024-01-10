package com.asg2comparable;

import java.util.ArrayList;
import java.util.Collections;


//6. Now do descending sort of Employee.id in Employee arraylist using < , > & == technique
public class Q7Employee implements Comparable<Q7Employee>{
	private int id;
	private String name;
	private String designation;
	private int age;

	public Q7Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q7Employee(int id, String name, String designation, int age) {
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
		ArrayList<Q7Employee> empList = new ArrayList<>();
		
		empList.add(new Q7Employee(102, "Raju", "Manager", 38));
		empList.add(new Q7Employee(101, "Purva", "HR", 38));
		empList.add(new Q7Employee());
		empList.add(new Q7Employee(103, "Amit", "TeamLead", 38));
		
		
		for(Q7Employee e : empList) {
			System.out.println(e);
		}
		
		Collections.sort(empList);
		System.out.println("______________After sorting______________");
		for(Q7Employee e : empList) {
			System.out.println(e);
		}

	}

	@Override
	public int compareTo(Q7Employee e) {
		if(this.getId()==e.getId()) {
			return 0;
		}else if (this.getId()<e.getId()) {
			return 1;
		}
		return -1;
	}

	

}
