package com.asg7TreeMap;

import java.util.TreeMap;

//2.	WAP to create a Treemap which contains Strings

public class Q2TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, String> tm = new TreeMap<>();

		tm.put("One", "Java");
		tm.put("Two", "C++");
		tm.put("Three", "Python");
		
		System.out.println(tm);
	}

}
