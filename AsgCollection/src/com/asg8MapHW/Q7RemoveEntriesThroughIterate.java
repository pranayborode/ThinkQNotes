package com.asg8MapHW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//7.	WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
public class Q7RemoveEntriesThroughIterate {

	static void removeEntries(HashMap<Integer, String> hm) {
		
		Set<Integer> keys = hm.keySet();
		
		Iterator<Integer>itr = keys.iterator();
		
		while(itr.hasNext()) {
			Integer key = itr.next();
			itr.remove();
			hm.remove(key);
		}
		
		System.out.println(hm);
		
	}
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");

		removeEntries(hm);
	}

}
