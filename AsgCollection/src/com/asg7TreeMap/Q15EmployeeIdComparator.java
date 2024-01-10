package com.asg7TreeMap;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;



//15.	WAP to create a TreeMap to store the Employee objects in a descending order 
//based on Employee Id and yet retrieve in ascending order

public class Q15EmployeeIdComparator {

	public static void main(String[] args) {

		TreeMap<Integer, Employee> tm = new TreeMap<>(Comparator.reverseOrder());
		

		tm.put(101, new Employee(1, "Rahul"));
		tm.put(102, new Employee(2, "Pratik"));
		tm.put(103, new Employee(3, "Anup"));
		tm.put(104, new Employee(4, "Charu"));
		
		
		System.out.println(tm);
		
		TreeMap<Integer, Employee> newMap = new TreeMap<>(Comparator.naturalOrder());
		newMap.putAll(tm);
		
		System.out.println(newMap);

	}

}
