package com.asg7TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

//8.	WAP to sort keys in TreeMap by using comparator

public class Q8SortKeysInTreeMap {

	public static void main(String[] args) {
	
		TreeMap<String, Integer> tm = new TreeMap<>(Comparator.naturalOrder());
		 
		tm.put("Shreysh", 89);
		tm.put("Amar", 67);
		tm.put("Ram", 64);
		tm.put("Riya", 77);
		tm.put("Shital", 59);
		tm.put("Priya", 67);
		
		
		System.out.println(tm);

	}

}
