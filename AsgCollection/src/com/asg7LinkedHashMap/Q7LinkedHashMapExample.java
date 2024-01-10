package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;

//7. WAP to create a LinkedHashMap which contains Integers as key and Strings as value. 
//   Print the map contents and observe the order. Use generics.

public class Q7LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(1, "Apple");
		lhm.put(2, "Banana");
		lhm.put(3, "Grapes");
		
		System.out.println(lhm);

	}

}
