package com.asg7TreeMap;

import java.util.TreeMap;

//10.	WAP to get the first (lowest) key and the last (highest) key currently in a TreeMap

public class Q10FirstAndLastKey {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<>();

		tm.put("Shreysh", 89);
		tm.put("Amar", 67);
		tm.put("Ram", 64);
		tm.put("Riya", 77);
		tm.put("Shital", 59);
		tm.put("Priya", 67);
		
		System.out.println(tm.firstKey());

		System.out.println(tm.lastKey());
	}

}
