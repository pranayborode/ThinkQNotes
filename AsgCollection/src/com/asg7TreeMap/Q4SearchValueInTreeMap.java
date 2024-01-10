package com.asg7TreeMap;

import java.util.Set;
import java.util.TreeMap;

//4.	WAP to search a value in a TreeMap

public class Q4SearchValueInTreeMap {

	public static void getKeyByValue(TreeMap<Integer, String> tm, String value) {

		boolean valuefound = false;
		
		for(String v : tm.values()) {
			
			if(value.equals(v)) {
					valuefound = true;
					break;
			}
		}
		if(valuefound) {
			System.out.println(value+" Value found in TreeMap");
		}else {
			System.out.println(value+" Value Not found in TreeMap");
		}
		
	
	}
	
	public static void main(String[] args) {
		

		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(1, "Java");
		tm.put(2, "Python");
		tm.put(3, "C++");
		
		String value = "Python";
		getKeyByValue(tm, value);

	}

}
