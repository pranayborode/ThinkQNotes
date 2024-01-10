package com.asg9SetAdditional;

import java.util.HashSet;

//3.	WAP to compare two sets and retain elements which are same on both sets.

public class Q3RetainCommonElementsExample {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<>();

		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");

		HashSet<String> set2 = new HashSet<>();

		set2.add("Apple");
		set2.add("Banana");
		set2.add("Grapes");

		set1.retainAll(set2);
		
		System.out.println("Common Elements: "+set1);
	}

}
