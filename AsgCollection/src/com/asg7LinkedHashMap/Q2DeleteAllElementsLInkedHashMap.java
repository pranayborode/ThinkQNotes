package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;

//2.	WAP to delete all elements from a given LinkedHashMap
public class Q2DeleteAllElementsLInkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(1, "Java");
		lhm.put(2, "C++");
		lhm.put(3, "Python");

		System.out.println(lhm);
		
		lhm.clear();
		
		System.out.println(lhm);
	}

}
