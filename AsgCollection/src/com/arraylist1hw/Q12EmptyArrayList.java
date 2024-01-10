package com.arraylist1hw;

import java.util.ArrayList;

//12.	WAP to empty an ArrayList
public class Q12EmptyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");

		System.out.println("Original ArrayList: " + list1);
		
		list1.removeAll(list1);
		
		System.out.println("New ArrayList: " + list1);

	}

}
