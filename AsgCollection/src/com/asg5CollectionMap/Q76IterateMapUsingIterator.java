package com.asg5CollectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//76. Iterate through map using iterator.

public class Q76IterateMapUsingIterator {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Raju");
		map.put(2, "Swapnil");
		map.put(3, "Yogesh");

		
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry entry = iterator.next();
			
			System.out.println(entry.getKey()+"--> "+entry.getValue());
		}
	}

}
