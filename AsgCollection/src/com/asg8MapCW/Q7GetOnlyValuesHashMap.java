package com.asg8MapCW;

import java.util.Collection;
import java.util.HashMap;

//7.	WAP to get only the Values from a HashMap
public class Q7GetOnlyValuesHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");

		Collection<String> val = hm.values();
		for (String s : val) {
			System.out.println(s);
		}

	}

}
