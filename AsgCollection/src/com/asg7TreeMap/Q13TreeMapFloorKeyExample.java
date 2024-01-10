package com.asg7TreeMap;

import java.util.TreeMap;

//13.	WAP to get the greatest key less than or equal to the given key
public class Q13TreeMapFloorKeyExample  {

	public static void main(String[] args) {
		
		
			
			TreeMap<String, Integer> tm = new TreeMap<>();

			tm.put("Shreysh", 89);
			tm.put("Amar", 67);
			tm.put("Ram", 64);
			tm.put("Riya", 77);
			tm.put("Shital", 59);
			tm.put("Priya", 67);
			
			
			System.out.println(tm.floorKey("Rahul"));

	}

}
