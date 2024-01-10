package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Collections;

//28. Sort arraylist of employees in ascending order of their salaries. 
//    If salary is same , list should be in descending order of name. 
public class Q28Employee {

	private int id;
	private String name;
	private double salary;

	public Q28Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q28Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Q28Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		ArrayList<Q28Employee> empList = new ArrayList<>();
		
		empList.add(new Q28Employee(103, "Pravin",33000 ));
		empList.add(new Q28Employee(101, "Shital",55000 ));
		empList.add(new Q28Employee(102, "Amar",57000 ));
		empList.add(new Q28Employee(105, "Ravi",33000 ));
		empList.add(new Q28Employee(104, "Ashwini",55000 ));

		
		Collections.sort(empList, new SalaryNameComparator());
		
		for(Q28Employee e : empList) {
			System.out.println(e);
		}
	}

}
