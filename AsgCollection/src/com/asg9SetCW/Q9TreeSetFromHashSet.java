package com.asg9SetCW;

import java.util.HashSet;
import java.util.TreeSet;

//9.	WAP to create a TreeSet from a HashSet.

public class Q9TreeSetFromHashSet {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banana");
		hashSet.add("Grapes");

		TreeSet<String> treeSet = new TreeSet<>(hashSet);
		
		 System.out.println("TreeSet created from HashSet: " + treeSet);
	}

}
