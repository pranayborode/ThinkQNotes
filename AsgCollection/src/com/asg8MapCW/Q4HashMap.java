package com.asg8MapCW;

import java.util.HashMap;
import java.util.Map;

//4.  WAP to create a map using Wrapper class as key and value same as keys’ 
//    data type WAP to count the number of key-value (size) mappings in a map.
public class Q4HashMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		
		System.out.println(map);
		
		System.out.println("Size: "+map.size());

	}

}
