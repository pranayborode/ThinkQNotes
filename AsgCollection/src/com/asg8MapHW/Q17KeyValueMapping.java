package com.asg8MapHW;

import java.util.HashMap;
import java.util.TreeMap;

//17. WAP to get a key-value mapping associated with the greatest key 
//    strictly less than the given key. Return null if there is no such key
public class Q17KeyValueMapping {

	public static void main(String[] args) {
		
		HashMap<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Red");
		myMap.put(20, "Green");
		myMap.put(40, "Black");
		myMap.put(50, "White");
		myMap.put(60, "Pink");

		
		TreeMap<Integer, String> treeMap = new TreeMap<>(myMap);
		
		System.out.println(treeMap.ceilingEntry(20));
		
		System.out.println(treeMap.ceilingEntry(40));
	
		System.out.println(treeMap.ceilingEntry(70));

	}

}
