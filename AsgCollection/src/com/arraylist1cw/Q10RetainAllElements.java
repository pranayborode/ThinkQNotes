package com.arraylist1cw;

import java.util.ArrayList;

//10.	WAP to retain all elements from ArrayList
public class Q10RetainAllElements {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");

		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("Three");
		list2.add("Seven");
		list2.add("Four");
		list2.add("Six");
		
		list1.retainAll(list2); ////keep only elements from list2 and remove rest
		
		System.out.println(list1);
	}

}
