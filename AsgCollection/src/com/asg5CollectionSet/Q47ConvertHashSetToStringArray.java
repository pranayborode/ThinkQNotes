package com.asg5CollectionSet;

import java.util.HashSet;

//47. Convert hashset of strings to string array

public class Q47ConvertHashSetToStringArray {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Orange");
		
		String strArr[] = new String[hs.size()];
		
		hs.toArray(strArr);
		
		System.out.println("String Array");
		for(String s : strArr) {
			System.out.println(s);
		}
			
		

	}

}
