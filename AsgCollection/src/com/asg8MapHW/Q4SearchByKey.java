package com.asg8MapHW;

import java.util.HashMap;

//4.	WAP to search for an element from HashMap using key
public class Q4SearchByKey {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");
		
		int key = 4;
		
		if(hm.containsKey(key)) {
			String value = hm.get(key);
			System.out.println("HashMap Contains Key:"+key+" Value: "+value);
		}else {
			System.out.println("HashMap Does Not Contains Key:"+key);
		}

	}

}
