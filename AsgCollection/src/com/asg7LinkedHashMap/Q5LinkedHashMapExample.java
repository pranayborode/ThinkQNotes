package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;

//5. WAP to create a LinkedHashMap which contains Strings as key and Integers as value. 
//   Print the map contents and observe the order. Don’t use generics.

public class Q5LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put("Java", 1);
		lhm.put("Python", 2);
		lhm.put("C++", 3);
		
		System.out.println(lhm);

	}

}
