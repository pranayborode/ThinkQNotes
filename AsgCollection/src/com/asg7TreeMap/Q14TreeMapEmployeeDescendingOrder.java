package com.asg7TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Q14TreeMapEmployeeDescendingOrder {

	public static void main(String[] args) {
	
		TreeMap<Integer, Employee> tm = new TreeMap<>(Comparator.reverseOrder());
		
		tm.put(101, new Employee(1, "Rahul"));
		tm.put(102, new Employee(2, "Pratik"));
		tm.put(103, new Employee(3, "Anup"));
		tm.put(104, new Employee(4, "Charu"));
		
		for(Map.Entry<Integer, Employee> entry : tm.entrySet()) {
			
			System.out.println("Key: "+entry.getKey()+" ==> Value: "+entry.getValue());
		}
		

	}

}
