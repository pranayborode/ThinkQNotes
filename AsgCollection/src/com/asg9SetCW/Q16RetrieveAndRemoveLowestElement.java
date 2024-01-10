package com.asg9SetCW;

import java.util.TreeSet;

//16.	WAP to retrieve and remove the lowest element of a TreeSet 
//      using a single method call. Repeat the same using 2 different method calls.

public class Q16RetrieveAndRemoveLowestElement {

	static void retrieveAndRemove1(TreeSet<Integer> treeSet) {

		Integer lowElement = treeSet.pollFirst();

		if (lowElement != null) {
			System.out.println("Lowrst Element Removed : " + lowElement);
			System.out.println(treeSet);
		} else {
			System.out.println("TreeSet is empty");
		}
	}
	
	static void retrieveAndRemove2(TreeSet<Integer> treeSet) {
		
		Integer lowElement = treeSet.first();
		
		if(treeSet.remove(lowElement)) {
			System.out.println("Lowrst Element Removed : " + lowElement);
			System.out.println(treeSet);
		} else {
			System.out.println("TreeSet is empty");
		}	
		
	}

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(4);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(8);
		treeSet.add(2);
		
		System.out.println(treeSet);
		
		retrieveAndRemove1(treeSet);

		retrieveAndRemove2(treeSet);
	}

}
