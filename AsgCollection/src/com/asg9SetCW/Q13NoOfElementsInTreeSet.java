package com.asg9SetCW;

import java.util.TreeSet;

//13.	WAP to get the number of elements in a TreeSet.

public class Q13NoOfElementsInTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Orange");
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Grapes");
		
		System.out.println("No of Elements in TreeSet: "+treeSet.size());

	}

}
