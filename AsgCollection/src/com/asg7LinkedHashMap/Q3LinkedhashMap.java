package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//3. WAP to create a LinkedhashMap with Integer as key and any other object as value. 
//   Now get a key-value mapping associated with the highest key and the least key in a map

public class Q3LinkedhashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(2, "C++");
		lhm.put(1, "Java");
		lhm.put(4, ".Net");
		lhm.put(3, "Python");
		
		TreeMap<Integer, String> tm = new TreeMap<>(lhm);

		System.out.println("Least Key: "+tm.firstEntry().getKey());
		System.out.println("Higest Key: "+tm.lastEntry().getKey());
		
	}

}
