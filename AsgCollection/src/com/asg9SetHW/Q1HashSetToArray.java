package com.asg9SetHW;

import java.util.HashSet;

///1.	WAP to convert a HashSet to an array.

public class Q1HashSetToArray {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();

		hs.add("Apple");
		hs.add("Banana");
		hs.add("Grapes");
		hs.add("Kivi");

		String strArr[] = new String[hs.size()];

		hs.toArray(strArr);

		System.out.println("Enelments in the array:");
		for (String e : strArr) {
			System.out.println(e);
		}
	}

}
