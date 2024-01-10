package com.asg9SetCW;

import java.util.HashSet;

//7.	WAP to test if a HashSet is empty or not.

public class Q7TestHashSetEmptyOrNot {

	static void checkEmpty(HashSet<String> colourSet) {
		
		if(colourSet.isEmpty()) {
			System.out.println("HashSet is Empty");
		}else {
			System.out.println("HashSet is Not Empty");
		}
	}
	
	public static void main(String[] args) {
		
		HashSet<String> colourSet = new HashSet<>();

		checkEmpty(colourSet);
		
		colourSet.add("Red");
		colourSet.add("Blue");
		colourSet.add("Green");
		
		checkEmpty(colourSet);

	}

}
