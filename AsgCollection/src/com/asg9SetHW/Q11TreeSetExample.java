package com.asg9SetHW;

import java.util.TreeSet;

//11.	WAP to get the element in a TreeSet which is strictly greater than or equal to the given element.
public class Q11TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(9);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(8);

		System.out.println(treeSet);

		System.out.println("Strictly greater than 3 : " + treeSet.higher(3));
		System.out.println("Strictly greater than 8 : " + treeSet.higher(8));

	}

}
