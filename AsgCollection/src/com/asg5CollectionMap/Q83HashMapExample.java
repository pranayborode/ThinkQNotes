package com.asg5CollectionMap;

import java.util.HashMap;
import java.util.Map;

//83. Write a program to create a hashmap as follows.
//a. A hashmap ‘oldMap’ has multiple duplicate values. Write a 
//program to create new hashmap ‘newMap’ which contains 
//keys as unique values of ‘oldMap’ and values as count of 
//number of times value has appeared in ‘map’.
//b. e.g oldMap = (1, ‘a’) , (2,’b’), (3,’c’), (4,’b’), (5,’a’), (6,’a’), 
//i. newMap = {‘a’,3) , (‘b’,2),(‘c’,1);

public class Q83HashMapExample {

	private static Map<Character, Integer> createNewMap(Map<Integer, Character> oldMap) {
		Map<Character, Integer> newMap = new HashMap<>();

		// Counting occurrences of values in oldMap
		for (Character value : oldMap.values()) {
			newMap.put(value, newMap.getOrDefault(value, 0) + 1);
		}

		return newMap;
	}

	public static void main(String[] args) {

		HashMap<Integer, Character> oldMap = new HashMap<>();

		oldMap.put(1, 'a');
		oldMap.put(2, 'b');
		oldMap.put(3, 'c');
		oldMap.put(4, 'b');
		oldMap.put(5, 'a');
		oldMap.put(6, 'a');

		Map<Character, Integer> newMap = createNewMap(oldMap);

		
		System.out.println("oldMap: " + oldMap);
		System.out.println("newMap: " + newMap);

	}

}
