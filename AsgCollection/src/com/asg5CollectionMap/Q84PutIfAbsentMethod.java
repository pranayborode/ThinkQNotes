package com.asg5CollectionMap;

import java.util.HashMap;

//84. Add key value pair to hashmap if and only if it is not present 
//    in hashmap. Make use of putifabsent method.
public class Q84PutIfAbsentMethod {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);

		System.out.println(hashMap);
		
		hashMap.putIfAbsent("One", 11);
		hashMap.putIfAbsent("Four", 4);
		
		System.out.println(hashMap);
		
	}

}
