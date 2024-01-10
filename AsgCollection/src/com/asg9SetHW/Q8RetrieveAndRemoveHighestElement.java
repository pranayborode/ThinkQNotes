package com.asg9SetHW;

import java.util.TreeSet;

//8. WAP to retrieve and remove the highest element of a TreeSet using a 
//   single method call. Repeat thesame using 2 different method calls.
public class Q8RetrieveAndRemoveHighestElement {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(9);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(8);
		
		System.out.println(treeSet);
		
		Integer  highestElement = treeSet.pollLast();
		
		System.out.println("Highest Element: "+highestElement);
		System.out.println(treeSet);
		
		Integer  highestElement2 = treeSet.last();
		treeSet.remove(highestElement2);
		
		System.out.println("Highest Element: "+highestElement2);
		System.out.println(treeSet);

	}

}
