package com.asg8MapHW;

import java.util.HashMap;

//2.	WAP to test a HashMap is empty or not

public class Q2CheckEmptyOrNot {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		System.out.println(hm.isEmpty());

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(4, ".Net");
		hm.put(3, "C++");

		System.out.println(hm.isEmpty());

	}

}
