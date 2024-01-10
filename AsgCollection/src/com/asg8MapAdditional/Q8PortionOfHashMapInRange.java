package com.asg8MapAdditional;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

//8.	WAP to get the portion of a HashMap whose keys range from a given key to another key.

public class Q8PortionOfHashMapInRange {

	public static void main(String[] args) {

		HashMap<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Red");
		myMap.put(20, "Green");
		myMap.put(40, "Black");
		myMap.put(50, "White");
		myMap.put(60, "Pink");

		TreeMap<Integer, String> treeMap = new TreeMap<>(myMap);

		SortedMap<Integer, String> subTreeMap = new TreeMap<>();

		System.out.println("Orginal TreeMap content: " + myMap);
		subTreeMap = treeMap.subMap(20, true, 40, true);
		System.out.println("Sub map key-values: " + subTreeMap);

	}

}
