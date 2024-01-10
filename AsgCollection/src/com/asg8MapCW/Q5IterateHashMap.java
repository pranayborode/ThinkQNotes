package com.asg8MapCW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//5.	WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values

public class Q5IterateHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");
		

		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
