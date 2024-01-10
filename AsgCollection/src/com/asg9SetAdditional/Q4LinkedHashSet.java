package com.asg9SetAdditional;

import java.util.LinkedHashSet;

//4.	Do above assignments for linkedhashset

public class Q4LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> set1 = new LinkedHashSet<>();

		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");

		LinkedHashSet<String> set2 = new LinkedHashSet<>();

		set2.add("Apple");
		set2.add("Banana");
		set2.add("Grapes");

		boolean areEqual = set1.equals(set2);

		if (areEqual) {
			System.out.println("The HashSets are Equal");
		} else {
			System.out.println("The HashSets are not Equal");
		}
		
		System.out.println("-----------------------------------------");

		set1.retainAll(set2);

		System.out.println("Common Elements: " + set1);

	}

}
