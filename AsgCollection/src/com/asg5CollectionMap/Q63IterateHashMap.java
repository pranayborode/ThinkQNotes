package com.asg5CollectionMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//63. Create hashmap<String, int>. Add 10 elements to hashmap and iterate map using for each loop and using iterator

public class Q63IterateHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(3, "C++");
		hm.put(4, ".Net");

		Set<Integer> keys = hm.keySet();

		for (Integer i : keys) {
			System.out.println(i + "-->" + hm.get(i));
		}

		System.out.println("------------------------------------");

		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {

			Integer k = itr.next();
			System.out.println(k + "-->" + hm.get(k));
		}

		System.out.println("------------------------------------");

		Collection<String> course = hm.values();
		for (String s : course) {
			System.out.println(s);
		}

		System.out.println("------------------------------------");

		Set<Entry<Integer, String>> entries = hm.entrySet();

		for (Map.Entry<Integer, String> e : entries) {

			System.out.println(e.getKey() + "-->" + e.getValue());

		}
		System.out.println();
		for (Map.Entry<Integer, String> e : entries) {

			System.out.println(e);

		}

	}

}
