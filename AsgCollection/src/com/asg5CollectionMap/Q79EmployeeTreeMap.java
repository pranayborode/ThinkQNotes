package com.asg5CollectionMap;

import java.util.Map;
import java.util.TreeMap;



//79. Create treemap using treemap(comparator) constructor. 
//    Create name comparater of employee class and pass it to constructor.

public class Q79EmployeeTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Employee, String> tmap = new TreeMap<>(new NameComparator());
		
		tmap.put(new Employee(101,"Pranali",45000), "IT");
		tmap.put(new Employee(102,"Prachi",56000), "HR");
		tmap.put(new Employee(103,"Pranay",49000), "Sales");
		tmap.put(new Employee(108,"Arpita",40000), "IT");
		tmap.put(new Employee(105,"Jyoti",50000), "HR");
		tmap.put(new Employee(106,"Nisha",57000), "IT");

		for(Map.Entry<Employee, String> entry : tmap.entrySet()) {
			
			System.out.println(entry.getKey()+" ==> "+entry.getValue());
			
		}
	}

}
