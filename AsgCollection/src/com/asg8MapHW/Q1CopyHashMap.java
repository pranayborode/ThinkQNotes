package com.asg8MapHW;

import java.util.HashMap;

//1.	WAP to copy all of the mappings from the specified HashMap to another map
public class Q1CopyHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");
		
		HashMap<Integer, String> newHm = new HashMap<>(hm);
		
		System.out.println(newHm);
		
		HashMap<Integer, String> newHm2 = new HashMap<>();

		newHm2.putAll(hm);
		
		System.out.println(hm);
	}

}
