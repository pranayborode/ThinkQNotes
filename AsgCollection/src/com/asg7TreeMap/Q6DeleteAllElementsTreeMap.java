package com.asg7TreeMap;

import java.util.TreeMap;

//6.	WAP to delete all elements from a given TreeMap

public class Q6DeleteAllElementsTreeMap {

	public static void main(String[] args) {

		TreeMap<String, Double> tmap = new TreeMap<>();
		
		tmap.put("Abhay", 89.7);
		tmap.put("Arpita", 56.4);
		tmap.put("Neelam", 90.3);
		tmap.put("Simran", 94.2);
		tmap.put("Mansi", 23.5);

		System.out.println(tmap);
		
		tmap.clear();
		
		System.out.println(tmap);
	}

}
