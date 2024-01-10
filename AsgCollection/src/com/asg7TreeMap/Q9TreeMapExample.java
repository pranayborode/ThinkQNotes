package com.asg7TreeMap;

import java.util.TreeMap;

//9. WAP to create a TreeMap with Integer as key and get a key-value mapping 
//   associated with the greatest key and the least key in a map

public class Q9TreeMapExample {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<>();

		tm.put("Shreysh", 89);
		tm.put("Amar", 67);
		tm.put("Ram", 64);
		tm.put("Riya", 77);
		tm.put("Shital", 59);
		tm.put("Priya", 67);

		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		
	

	}

}
