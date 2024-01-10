package com.arraylist1cw;

import java.util.ArrayList;

//19.	WAP to match two collections
public class Q19MatchTwoCollections {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Apple");
		list2.add("Banana");
		list2.add("Orange");

		boolean listEqual = list1.equals(list2);

		if (listEqual) {
			System.out.println("Two Collections are equal");

		} else {

			System.out.println("Two Collections are not equal");
		}

	}

}
