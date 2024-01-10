package com.asg5CollectionMap;

import java.util.HashMap;
import java.util.Map;

//72. Create map within map. Iterate both. 

public class Q72NestedMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> innerMap1= new HashMap<>();
		
		innerMap1.put(1, "One");
		innerMap1.put(2, "Two");
		
		Map<Integer, String>  innerMap2= new HashMap<>();
		
		innerMap2.put(3, "Three");
		innerMap2.put(4, "Four");
		
		
		Map<String, Map<Integer, String>> outerMap = new HashMap<>();
		
		outerMap.put("Map1", innerMap1);
		outerMap.put("Map2", innerMap2);
		
		
		for(Map.Entry<String, Map<Integer, String>> outerEntry : outerMap.entrySet()) {
			
			String outerKey = outerEntry.getKey();
			
			Map<Integer, String> innerMap = outerEntry.getValue();
			
			System.out.println("Outer Key: "+outerKey);
			
			for(Map.Entry<Integer, String> innerEntry : innerMap.entrySet()) {
				
				System.out.println(innerEntry.getKey()+" ==> "+innerEntry.getValue());
			}
			
			System.out.println();
			
		}
		
		
	}

}
