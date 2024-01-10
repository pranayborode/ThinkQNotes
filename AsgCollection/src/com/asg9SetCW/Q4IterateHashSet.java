package com.asg9SetCW;

import java.util.HashSet;
import java.util.Iterator;

//4.	WAP to iterate through all elements in a HashSet and print the elements. Observe the order ofelements.
public class Q4IterateHashSet {

	public static void main(String[] args) {

		HashSet<String> colourSet = new HashSet<>();

		colourSet.add("Red");
		colourSet.add("Blue");
		colourSet.add("Green");
		
		Iterator<String> itr = colourSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
