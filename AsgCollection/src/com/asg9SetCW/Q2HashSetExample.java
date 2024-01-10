package com.asg9SetCW;

import java.util.HashSet;

//2.	WAP to create a HashSet with some colors (String) using generics
public class Q2HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> colourSet = new HashSet<>();
		
		colourSet.add("Red");
		colourSet.add("Blue");
		colourSet.add("Green");
		
		System.out.println(colourSet);
		

	}

}
