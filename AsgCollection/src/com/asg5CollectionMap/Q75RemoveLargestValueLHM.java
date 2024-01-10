package com.asg5CollectionMap;


import java.util.LinkedHashMap;
import java.util.Map;


//75. 	Remove largest value from linked hashmap. 
public class Q75RemoveLargestValueLHM {

	public static void removeLargestValue(LinkedHashMap<String, Integer> lhm) {

		Map.Entry<String, Integer> maxEntry = null;
		
		for(Map.Entry<String, Integer> entry : lhm.entrySet()) {
			
			if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}
		
		if(maxEntry != null) {
			lhm.remove(maxEntry.getKey());
			System.out.println("Remove Largest vlaue : "+maxEntry.getKey());
		}else {
			System.out.println("No entry found to remove");
		}

	}

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
        linkedHashMap.put("One", 10);
        linkedHashMap.put("Two", 5);
        linkedHashMap.put("Three", 20);
        linkedHashMap.put("Four", 55);
        linkedHashMap.put("Five", 8);
        
        removeLargestValue(linkedHashMap);
        
        System.out.println(linkedHashMap);

	}

}
