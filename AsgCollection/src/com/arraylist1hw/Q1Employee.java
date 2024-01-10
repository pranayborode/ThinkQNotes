package com.arraylist1hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//1.WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. 
//  Sysout and see both variable memory space is printed. This is because toString is not overriden 
//  but if you would have done this for Integer then beautiful output would have been printed.

//2.	Now override toString for earlier assignment and now sysout and see values are printed

//3.	WAP to print Emp whose salary is > 10000

//4.	WAP to print Emp who have name "Sachin"
//5.	WAP to print Emp who have highest number of salary

public class Q1Employee {
	private int id;
	private String name;
	private double salary;

	public Q1Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Q1Employee(int id, String name, double salary) {
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
		return "Q1Employee : id=" + id + ", name=" + name + ", salary=" + salary;
	}
	
	//3.	WAP to print Emp whose salary is > 10000
	static void findTargetSalary(ArrayList<Q1Employee> empList) {
		
		for(Q1Employee e: empList) {
			
			if(e.getSalary()>10000) {
				System.out.println(e);
			}
		}
		
	}
	
	//4.	WAP to print Emp who have name "Sachin"
	
	static void findName(ArrayList<Q1Employee> empList, String name) {
		
		for(Q1Employee e: empList) {
			
			if(e.getName().equalsIgnoreCase(name)) {
				System.out.println(e);
			}
		}
	}
	
	//5.	WAP to print Emp who have highest number of salary
	
	static void findHigestSalary(ArrayList<Q1Employee> empList) {
		
		
		Q1Employee higestSalaryEmp = empList.get(0); 
		for(Q1Employee e: empList) {
			
			if(e.getSalary()>higestSalaryEmp.salary) {
				higestSalaryEmp = e;
			}
		}
		System.out.println(higestSalaryEmp);
	}

	public static void main(String[] args) {

		ArrayList<Q1Employee> empList = new ArrayList<>();

		empList.add(new Q1Employee(101, "Rahul", 5000));
		empList.add(new Q1Employee(102, "Sachin", 45000));
		empList.add(new Q1Employee(104, "Priya", 7000));
		empList.add(new Q1Employee(103, "Aradhya", 65000));

		for (Q1Employee e : empList) {
			System.out.println(e);
		}

		System.out.println("Employee who has higest salary");
		Collections.sort(empList, new SalaryComparator());
		
		System.out.println("**************************************");
		
		findTargetSalary(empList);
		
		System.out.println("******************Sachin********************");
		
		String name = "Sachin";
		findName(empList, name);
		
		System.out.println("**********************************************");
		
		findHigestSalary(empList);
		
		System.out.println("**********************************************");
		for (Q1Employee e : empList) {
			System.out.println(e);
		}
		
		

	}

}
