package com.asg9SetCW;

import java.util.Iterator;
import java.util.TreeSet;

//12.	WAP to get the first and last elements in a TreeSet.

public class Q12FirstAndLastElements {

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
		
		System.out.println("****************************");
		
		System.out.println("First Element: "+treeSet.first());
		
		System.out.println("Last Element: "+treeSet.last());

	}

}
