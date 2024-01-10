package com.asg8MapCW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//6.	WAP to get only the Keys from a HashMap
public class Q6GetOnlyKeysHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");
		
		Set<Integer> keys = hm.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
