package com.asg9SetAdditional;

import java.util.HashSet;

//2.WAP to compare the elements in two HashSets.

public class Q2CompareElements {

	public static void main(String[] args) {

		HashSet<String> set1 = new HashSet<>();

		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");

		HashSet<String> set2 = new HashSet<>();

		set2.add("Apple");
		set2.add("Banana");
		set2.add("Orange");

		boolean areEqual = set1.equals(set2);
		
		if(areEqual) {
			System.out.println("The HashSets are Equal");
		}else {
			System.out.println("The HashSets are not Equal");
		}
	}

}
