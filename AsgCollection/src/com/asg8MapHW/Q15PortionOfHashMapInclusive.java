package com.asg8MapHW;

import java.util.HashMap;
import java.util.TreeMap;

//15.WAP to get the portion of this HashMap whose keys are less than (or equal to, if inclusive is true) a given key

public class Q15PortionOfHashMapInclusive {

	public static void main(String[] args) {
		
		HashMap<Integer, String> myMap = new HashMap<>();

		myMap.put(10, "Red");
		myMap.put(20, "Green");
		myMap.put(40, "Black");
		myMap.put(50, "White");
		myMap.put(60, "Pink");

		
		TreeMap<Integer, String> treeMap = new TreeMap<>(myMap);
		
		System.out.println(treeMap.headMap(10, true));
		
		System.out.println(treeMap.headMap(20, true));
	
		System.out.println(treeMap.headMap(70, true));

	}

}
