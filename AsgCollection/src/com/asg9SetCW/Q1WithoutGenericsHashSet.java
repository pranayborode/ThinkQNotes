package com.asg9SetCW;

import java.util.HashSet;

//1.	WAP to create a HashSet with Integer objects without using generics
public class Q1WithoutGenericsHashSet {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();

		hs.add(123);
		hs.add("India");
		hs.add(12.12f);
		hs.add('A');
		
		System.out.println(hs);
	}

}
