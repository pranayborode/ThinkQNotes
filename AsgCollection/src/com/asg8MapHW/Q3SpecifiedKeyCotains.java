package com.asg8MapHW;

import java.util.HashMap;

//3.	WAP to test if a HashMap contains a mapping for the specified key

public class Q3SpecifiedKeyCotains {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");
		
		int key = 4;
		
		if(hm.containsKey(key)) {
			System.out.println("HashMap Contains Key:"+key);
		}else {
			System.out.println("HashMap Does Not Contains Key:"+key);
		}

	}

}
