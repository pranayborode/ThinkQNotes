package com.asg8MapHW;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//12.	WAP to create a Map which stores another Map as a value.

public class Q12NestedMapvalue {

	public static void main(String[] args) {
		
		Map<Integer, String> innerMap = new HashMap<>();

		innerMap.put(1, "Apple");
		innerMap.put(2, "Mango");
		innerMap.put(3, "Banana");
		
		Map<Integer, Map<Integer,String>> outerMap = new HashMap<>();
		
		outerMap.put(1, innerMap);
		
		for(Entry<Integer, Map<Integer, String>> entry:outerMap.entrySet()) {
			
			for(Entry<Integer,String> e: innerMap.entrySet()) {
				
				System.out.println(entry.getKey()+"-->"+e.getKey()+":"+e.getValue());
			}
			
			
		}
	}

}
