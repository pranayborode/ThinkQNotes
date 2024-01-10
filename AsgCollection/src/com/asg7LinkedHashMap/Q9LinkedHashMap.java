package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

//9.	WAP to create a LinkedHashMap. Add 3 objects in it.
//a.	WAP to search a value in the Map.
//b.	WAP to get all keys in the Map.
//c.	WAP to remove an element from the Map.

public class Q9LinkedHashMap {

	static void findValue(LinkedHashMap<Integer, String> lhm, String val) {

		if (lhm.containsValue(val)) {
			System.out.println("Value " + val + " found in LinkedHashMap");
		} else {
			System.out.println("Value " + val + " not found in LinkedHashMap");
		}
	}

	static void getAllKeys(LinkedHashMap<Integer, String> lhm) {

		Set<Integer> keys = lhm.keySet();

		System.out.println(keys);
	}

	static void removeElement(LinkedHashMap<Integer, String> lhm, Integer key) {
		
		lhm.remove(key);
		System.out.println(lhm);
	}
	
	
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(1, "Java");
		lhm.put(2, "C++");
		lhm.put(3, "Python");

		findValue(lhm, "Python");
		findValue(lhm, ".Net");

		getAllKeys(lhm);

		removeElement(lhm, 2);
	}

}
