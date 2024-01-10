package com.asg8MapHW;

import java.util.HashMap;
import java.util.TreeMap;

public class Q16LeastKeyGreaterThanGivenKey{

	public static void main(String[] args) {
		
		HashMap<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Red");
		myMap.put(20, "Green");
		myMap.put(40, "Black");
		myMap.put(50, "White");
		myMap.put(60, "Pink");

		
		TreeMap<Integer, String> treeMap = new TreeMap<>(myMap);
		
		System.out.println(treeMap.higherEntry(10));
		
		System.out.println(treeMap.higherEntry(20));
	
		System.out.println(treeMap.higherEntry(70));
		
	}

}
