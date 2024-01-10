package com.asg7LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

//1.	WAP to copy a HashMap content to another LinkedHashMap
public class Q1CopyHashMapToLinkedHashMap  {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "Java");
		hashMap.put(2, "Python");
		hashMap.put(3, ".Net");
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
		
		for(Entry<Integer, String> e: linkedHashMap.entrySet()) {
			
			System.out.println(e.getKey()+" ==> "+e.getValue());
		}
		

	}

}
