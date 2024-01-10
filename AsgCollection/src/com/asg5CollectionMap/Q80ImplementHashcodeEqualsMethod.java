package com.asg5CollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



//80. Implement hashcode and equals method to avoid duplicate entry of employees in hashmap.
public class Q80ImplementHashcodeEqualsMethod {

	public static void main(String[] args) {

		HashMap<Employees, String> tmap = new HashMap<>();

		tmap.put(new Employees(101, "Pranali", 45000), "IT");
		tmap.put(new Employees(102, "Prachi", 56000), "HR");
		tmap.put(new Employees(103, "Pranay", 49000), "Sales");
		tmap.put(new Employees(108, "Arpita", 40000), "IT");
		tmap.put(new Employees(105, "Jyoti", 50000), "HR");
		tmap.put(new Employees(103, "Pranay", 49000), "Sales");
		tmap.put(new Employees(106, "Nisha", 57000), "IT");
		
		
		for(Map.Entry<Employees,String>e: tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------");
		}
	}

}
