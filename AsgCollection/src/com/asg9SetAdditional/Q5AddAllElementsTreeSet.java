package com.asg9SetAdditional;

import java.util.LinkedHashSet;

//5.	WAP to add all the elements of a specified TreeSet to another TreeSet.
public class Q5AddAllElementsTreeSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();

		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		
		set2.addAll(set1);
		
		System.out.println(set2);

	}

}
