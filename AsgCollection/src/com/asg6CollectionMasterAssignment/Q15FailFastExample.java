package com.asg6CollectionMasterAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Write a code that shows Iterator is fail fast.
public class Q15FailFastExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("Russia", "Moscow");
		map.put("USA", "New York");
		
		Iterator iterator = map.keySet().iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(map.get(iterator.next()));
			
			map.put("Turkey", "Istanbul");
		}

	}

}
