package com.asg8MapAdditional;

import java.util.HashMap;
import java.util.TreeMap;

//9.	WAP to get a portion of a HashMap whose keys are greater than or equal to a given key.
public class Q9PortionOfHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Red");
		myMap.put(20, "Green");
		myMap.put(40, "Black");
		myMap.put(50, "White");
		myMap.put(60, "Pink");

		TreeMap<Integer, String> treeMap = new TreeMap<>(myMap);


		System.out.println("Orginal TreeMap content: " + treeMap);
		System.out.println("Keys are greater than or equal to 20: " + treeMap.tailMap(20));
	}

}
