package com.asg5CollectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//73. Create a hashmap <int,String> where key is integers 1 to 
//    10 and string is number in words. Remove entry for which 
//    number is divisible by 3 

public class Q73RemoveEntryDivisibleBy3 {

	public static void removeEntryDivBy3(HashMap<Integer, String> hashMap) {

		Iterator<Entry<Integer, String>>iterator = hashMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			
			Map.Entry<Integer, String> entry = iterator.next();
			
			if(entry.getKey() %3 ==0) {
				iterator.remove();
			}
		}
		
	}

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		hashMap.put(4, "Four");
		hashMap.put(5, "Five");
		hashMap.put(6, "Six");
		hashMap.put(7, "Seven");
		hashMap.put(8, "Eight");
		hashMap.put(9, "Nine");
		hashMap.put(10, "Ten");
		
		
		System.out.println(hashMap);
		
		removeEntryDivBy3(hashMap);
		
		System.out.println(hashMap);

	}

}
