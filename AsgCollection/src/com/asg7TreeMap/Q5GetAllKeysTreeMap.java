package com.asg7TreeMap;

import java.util.Map;
import java.util.TreeMap;

//5.	WAP to get all keys from the given a TreeMap

public class Q5GetAllKeysTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Double> tmap = new TreeMap<>();
		tmap.put("Abhay", 89.7);
		tmap.put("Arpita", 56.4);
		tmap.put("Neelam", 90.3);
		tmap.put("Simran", 94.2);
		tmap.put("Mansi", 23.5);
		
		for (Map.Entry<String, Double> e : tmap.entrySet()) {
			System.out.println(e.getKey());
		}

	}

}
