package com.arraylist1hw;

import java.util.ArrayList;
import java.util.Collections;

//18.	WAP to reverse elements in an ArrayList
public class Q18ReverseElements {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");

		System.out.println("Original ArrayList: " + list1);

		Collections.reverse(list1);
		
		System.out.println("New ArrayList: " + list1);

	}

}
