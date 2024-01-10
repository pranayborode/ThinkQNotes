package com.asg9SetHW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

//2.	WAP to remove all of the elements from a HashSet.

public class Q2RemoveAllElements {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();

		hs.add("Apple");
		hs.add("Banana");
		hs.add("Grapes");
		hs.add("Kivi");

		System.out.println(hs);
		
		hs.clear();
	
		System.out.println(hs);
	}

}
