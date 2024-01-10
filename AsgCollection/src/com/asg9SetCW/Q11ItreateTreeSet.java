package com.asg9SetCW;

import java.util.Iterator;
import java.util.TreeSet;

//11.	WAP to iterate through all elements in a TreeSet.

public class Q11ItreateTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Orange");
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Grapes");
		
		Iterator<String> itr = treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
