package com.asg8MapHW;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//14.	WAP to get the portion of a HashMap whose keys are strictly less than a given key

public class Q14PortionOfHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Red");
		myMap.put(20, "Green");
		myMap.put(40, "Black");
		myMap.put(50, "White");
		myMap.put(60, "Pink");

		
		TreeMap<Integer, String> treeMap = new TreeMap<>(myMap);
		
		System.out.println(treeMap.headMap(10));
		
		System.out.println(treeMap.headMap(30));
	
		System.out.println(treeMap.headMap(70));
	}

}
