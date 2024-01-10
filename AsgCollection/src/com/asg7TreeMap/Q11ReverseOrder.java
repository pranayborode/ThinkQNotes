package com.asg7TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

//11.	WAP to get a reverse order view of the keys contained in a given map TreeMap
public class Q11ReverseOrder {

	public static void main(String[] args) {
	

		TreeMap<String, Integer> tm = new TreeMap<>();

		tm.put("Shreysh", 89);
		tm.put("Amar", 67);
		tm.put("Ram", 64);
		tm.put("Riya", 77);
		tm.put("Shital", 59);
		tm.put("Priya", 67);

		System.out.println(tm);
		
		System.out.println("--------------------------------------");
		
		NavigableMap<String, Integer>map = tm.descendingMap();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println("Key: "+entry.getKey()+" ==> Value: "+entry.getValue());
		}
		
	}

}
