package com.asg9SetHW;

import java.util.TreeSet;

//15.	WAP to find the numbers greater than 7 in a TreeSet which contains Integer objects.

public class Q15FindGreterThan7 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(9);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(8);

		System.out.println(treeSet);

		TreeSet<Integer> numLessThan7 = new TreeSet<>(treeSet.tailSet(7+1));

		System.out.println(numLessThan7);

	}

}
