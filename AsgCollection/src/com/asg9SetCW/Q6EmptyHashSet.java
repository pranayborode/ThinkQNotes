package com.asg9SetCW;

import java.util.HashSet;

//6.	WAP to empty a HashSet.

public class Q6EmptyHashSet {

	public static void main(String[] args) {

		HashSet<String> colourSet = new HashSet<>();

		colourSet.add("Red");
		colourSet.add("Blue");
		colourSet.add("Green");
		
		System.out.println(colourSet);

		colourSet.clear();
		
		System.out.println(colourSet);
	}

}
