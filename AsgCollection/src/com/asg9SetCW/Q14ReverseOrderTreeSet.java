package com.asg9SetCW;

import java.util.Iterator;
import java.util.TreeSet;

//14.	WAP to create a reverse order view of the elements contained in a given TreeSet.

public class Q14ReverseOrderTreeSet {

	public static void main(String[] args) {
	

		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Orange");
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Grapes");
		
		TreeSet<String> revTreeSet = new TreeSet<>(treeSet.descendingSet());
		
		Iterator<String> itr = revTreeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
