package com.arraylist1cw;

import java.util.ArrayList;

//9.	WAP to remove all elements from ArrayList
public class Q9RemoveAllElements {

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
