package com.asg9SetHW;

import java.util.TreeSet;

//9.	WAP to get the element in a TreeSet which is greater than or equal to the given element.

public class Q9TreeSetElement {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(9);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(8);

		System.out.println(treeSet);
		
		System.out.println("Greater than or equal to 3 : "+treeSet.ceiling(3));
		System.out.println("Greater than or equal to 8 : "+treeSet.ceiling(8));
	}

}
