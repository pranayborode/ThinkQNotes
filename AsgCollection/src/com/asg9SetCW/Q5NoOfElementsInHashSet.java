package com.asg9SetCW;

import java.util.HashSet;

//5.	WAP to get the number of elements in a HashSet.

public class Q5NoOfElementsInHashSet {

	public static void main(String[] args) {

		HashSet<String> colourSet = new HashSet<>();

		colourSet.add("Red");
		colourSet.add("Blue");
		colourSet.add("Green");
		
		System.out.println("No of Elements: "+colourSet.size());

	}

}
