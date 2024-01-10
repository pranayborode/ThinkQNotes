package com.arraylist1hw;

import java.util.ArrayList;

//8.	WAP to copy one ArrayList into another
public class Q8CopyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");

		ArrayList<String> list2 = new ArrayList<>();

		list2.addAll(list1);

		System.out.println(list2);

	}

}
