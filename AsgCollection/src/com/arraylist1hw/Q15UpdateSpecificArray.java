package com.arraylist1hw;

import java.util.ArrayList;

//15.	WAP to update specific array element by given element
public class Q15UpdateSpecificArray {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		
		System.out.println("Before: "+list1);
		list1.set(1, "Nine");
		System.out.println("after: "+list1);
		

	}

}
