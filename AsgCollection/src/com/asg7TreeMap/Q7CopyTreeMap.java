package com.asg7TreeMap;

import java.util.TreeMap;

//7.	WAP to copy a TreeMap content to another TreeMap

public class Q7CopyTreeMap {

	public static void main(String[] args) {
		

		TreeMap<String, Double> tmap = new TreeMap<>();
		
		tmap.put("Abhay", 89.7);
		tmap.put("Arpita", 56.4);
		tmap.put("Neelam", 90.3);
		tmap.put("Simran", 94.2);
		tmap.put("Mansi", 23.5);
		
		TreeMap<String, Double> newMap = new TreeMap<>(tmap);
		
		System.out.println(newMap);

	}

}
