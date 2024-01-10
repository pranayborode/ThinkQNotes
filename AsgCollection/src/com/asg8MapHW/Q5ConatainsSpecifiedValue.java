package com.asg8MapHW;

import java.util.HashMap;

//5.	WAP to test if a HashMap contains a mapping for the specified value
public class Q5ConatainsSpecifiedValue {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");
		
		String value = "Python";
		
		if(hm.containsValue(value)) {
			System.out.println("HashMap Contains value: "+value);
		}else {
			System.out.println("HashMap does not contains Value "+value);
		}

	}

}
