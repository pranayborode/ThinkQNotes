package com.asg8MapHW;

import java.util.HashMap;

//6.	WAP to remove an element from HashMap using key

public class Q6RemoveElementUsingKey {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");

		System.out.println("Before Remove: "+hm);
		int key = 4;

		if (hm.containsKey(key)) {
			
			hm.remove(key);
			System.out.println("Key removed...");

		} else {
			System.out.println("HashMap Does Not Contains Key:" + key);
		}

		System.out.println("After Remove: "+hm);
	}

}
