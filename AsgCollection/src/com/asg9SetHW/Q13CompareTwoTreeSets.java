package com.asg9SetHW;

import java.util.TreeSet;

//13.	WAP to compare two TreeSets.

public class Q13CompareTwoTreeSets {

	public static void main(String[] args) {

		TreeSet<String> treeSet1 = new TreeSet<>();

		treeSet1.add("Red");
		treeSet1.add("Green");
		treeSet1.add("Blue");
		treeSet1.add("White");

		TreeSet<String> treeSet2 = new TreeSet<>();

		treeSet2.add("Red");
		treeSet2.add("Orange");
		treeSet2.add("Blue");
		treeSet2.add("Yellow");
		
		TreeSet<String> result = new TreeSet<>();
		for(String e : treeSet1) {
			System.out.println(treeSet2.contains(e) ? "Yes": "NO");
		}

	}

}
