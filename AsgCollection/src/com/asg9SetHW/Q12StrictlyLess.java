package com.asg9SetHW;

import java.util.TreeSet;

//12.	WAP to get an element in a TreeSet which is strictly less than the given element.

public class Q12StrictlyLess {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(9);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(8);

		System.out.println(treeSet);

		System.out.println("Strictly less than 3 : " + treeSet.lower(3));
		System.out.println("Strictly less than 8 : " + treeSet.lower(8));

	}

}
