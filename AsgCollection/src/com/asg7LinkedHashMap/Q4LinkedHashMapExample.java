package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//4. WAP to create a LinkedHashMap which contains Integers as key and Strings as value. 
//   Print the map contents and observe the order. Don’t use generics.
public class Q4LinkedHashMapExample  {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put(2, "C++");
		lhm.put("Java",1 );
		lhm.put(4, ".Net");
		lhm.put(3, "Python");
		
		

		System.out.println("----------------------------------");
		
		System.out.println(lhm);
		
		System.out.println("----------------------------------");
		
		Set<Entry<Integer, String>> entries = lhm.entrySet();
		
		for(Map.Entry e : entries) {
			System.out.println(e.getKey()+"=>"+e.getValue());
		}
	}

}
