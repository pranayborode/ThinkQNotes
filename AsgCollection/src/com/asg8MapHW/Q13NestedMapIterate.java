package com.asg8MapHW;

import java.util.HashMap;
import java.util.Map;

//13.	WAP to iterate the elements in the Map stored in the above Map

public class Q13NestedMapIterate {

	public static void main(String[] args) {

		Map<Integer, String> innerMap = new HashMap<>();

		innerMap.put(1, "Apple");
		innerMap.put(2, "Mango");
		innerMap.put(3, "Banana");

		Map<Integer, Map<Integer, String>> outerMap = new HashMap<>();

		outerMap.put(1, innerMap);
		
		for(Map.Entry<Integer, Map<Integer, String>> entry : outerMap.entrySet()) {
			
			Integer key = entry.getKey();
			
			Map<Integer, String> innMap = entry.getValue();
			
			System.out.println("Outer Map key: "+key);
			
			for(Map.Entry<Integer, String> innerEntry: innerMap.entrySet()) {
				
				Integer innerKey = innerEntry.getKey();
				String innerValue = innerEntry.getValue();
				
				System.out.println("Inner Key : "+innerKey+"--- Inner Value : "+innerValue);
			}
			System.out.println();
		}
	}

}
