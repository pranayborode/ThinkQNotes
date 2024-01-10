package com.asg8MapCW;

import java.util.HashMap;

//1. WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it. 
//   Use Integer as Key and String as Value. In second HashMap add elements of String type as Key and Integer as Value.

public class Q1HashMapExample {

	public static void main(String[] args) {
		
		HashMap hm1 = new HashMap();
		
		hm1.put(1, "One");
		hm1.put(3, "Three");
		hm1.put(2, "Two");
		
		HashMap hm2 = new HashMap();
			
		hm2.put("Two", 2);
		hm2.put("Three", 3);
		hm2.put("One", 1);
		
		System.out.println(hm1);
		
		System.out.println(hm2);

	}

}
