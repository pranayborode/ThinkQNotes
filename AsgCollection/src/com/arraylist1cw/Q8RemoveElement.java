package com.arraylist1cw;

import java.util.ArrayList;

//8.	WAP to remove element from ArrayList
public class Q8RemoveElement {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");

		System.out.println("Original ArrayList: " + list1);

		list1.remove("Four");  //remove method 

		System.out.println("New ArrayList: " + list1);

	}

}
