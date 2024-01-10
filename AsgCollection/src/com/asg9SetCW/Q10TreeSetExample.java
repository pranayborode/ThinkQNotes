package com.asg9SetCW;

import java.util.TreeSet;

//10.	WAP to create a new TreeSet, add Strings and print the TreeSet.

public class Q10TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Orange");
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Grapes");
		
		System.out.println(treeSet);

	}

}
