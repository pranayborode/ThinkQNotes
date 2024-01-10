package com.asg7TreeMap;

import java.util.TreeMap;

public class Q16EmployeesComparable {

	public static void main(String[] args) {
		
		TreeMap<Employees, String> empMap = new TreeMap<>();

		empMap.put(new Employees(101, "Rahul"), "Dep1");
		empMap.put(new Employees(103, "Pratik"), "Dep2");
		empMap.put(new Employees(104, "Anup"), "Dep3");
		empMap.put(new Employees(102, "Charu"), "Dep4");
		
		
		System.out.println(empMap);
	}

}
