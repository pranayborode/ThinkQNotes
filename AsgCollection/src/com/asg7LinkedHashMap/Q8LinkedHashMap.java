package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;

//8. WAP to create a LinkedHashMap which contains Strings as key and Integers as value. 
//   Print the map contents and observe the order. Use generics.

public class Q8LinkedHashMap {

	public static void main(String[] args) {
	
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("One", 1);
		lhm.put("Two", 2);
		lhm.put("Three", 3);
		
		System.out.println(lhm);
		
		

	}

}
