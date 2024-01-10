package com.asg9SetHW;

import java.util.HashSet;

//4.	WAP to add user defined objects of type Employee in a HashSet using duplicate Employee object.

public class Q4DuplicateEmployee {

	public static void main(String[] args) {
		 
		HashSet<Employee> empSet = new HashSet<>();
		
		empSet.add(new Employee(101, "Milind"));
		empSet.add(new Employee(102, "Utkarsh"));
		empSet.add(new Employee(103, "Mukul"));
		
		
		for (Employee e : empSet) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------------");
		
		boolean isDuplicateAdded = empSet.add(new Employee(101, "Rahul"));
		
		for (Employee e : empSet) {
			System.out.println(e);
		}
		
		System.out.println(isDuplicateAdded);
		
	}

}
