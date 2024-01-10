package com.asg7TreeMap;

import java.util.TreeMap;

//3.	WAP to search a key in a TreeMap

public class Q3SearchKeyInTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(1, "Java");
		tm.put(2, "Python");
		tm.put(3, "C++");

		int key = 2;

		if (tm.containsKey(key)) {
			String value = tm.get(key);
			System.out.println("Key : " + key + " ==> Value : " + value);
		} else {
			System.out.println("Not Found");
		}

	}

}
