package com.arraylist1hw;

import java.util.ArrayList;

//10.	WAP to join two ArrayLists
public class Q10JoinTwoArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Five");
		list2.add("Six");
		list2.add("Seven");
		list2.add("Eight");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		

	}

}
