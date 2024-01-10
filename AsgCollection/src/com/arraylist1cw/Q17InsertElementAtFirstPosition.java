package com.arraylist1cw;

import java.util.ArrayList;

//17.	WAP to insert an element into the ArrayList at the first position
public class Q17InsertElementAtFirstPosition {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Red");
		list1.add("Orange");
		list1.add("Yellow");
		list1.add("Blue");
		
		System.out.println("Before: "+list1);
		
		list1.add(3, "Green");

		System.out.println("After: "+list1);
	}

}
