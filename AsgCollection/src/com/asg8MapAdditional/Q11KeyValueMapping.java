package com.asg8MapAdditional;

import java.util.HashMap;
import java.util.TreeMap;

//11.	WAP to get a key-value mapping associated with the least key greater 
//      than or equal to the given key. Return null if there is no such key.
public class Q11KeyValueMapping {

	public static void main(String[] args) {

		HashMap<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Red");
		myMap.put(20, "Green");
		myMap.put(40, "Black");
		myMap.put(50, "White");
		myMap.put(60, "Pink");

		TreeMap<Integer, String> treeMap = new TreeMap<>(myMap);

		System.out.println("Orginal TreeMap content: " + treeMap);
		System.out.println("Keys greater than or equal to 20: " + treeMap.ceilingKey(20));
		System.out.println("Keys greater than or equal to 30: " + treeMap.ceilingKey(30));
		System.out.println("Keys greater than or equal to 50: " + treeMap.ceilingKey(50));

	}

}
