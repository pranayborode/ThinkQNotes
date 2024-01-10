package com.asg9SetHW;

import java.util.HashSet;

//1.	Print the contents in the Set.
public class Q5PrintContentsInSet {

	public static void main(String[] args) {

		HashSet<String> colourSet = new HashSet<>();

		colourSet.add("Red");
		colourSet.add("Blue");
		colourSet.add("Green");

		for(String s : colourSet) {
			System.out.println(s);
		}
	}

}
