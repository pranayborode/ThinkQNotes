package com.arraylist1hw;

import java.util.ArrayList;
import java.util.List;

//19.	WAP to extract a portion of an ArrayList
public class Q19ExtractPortion {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("six");

		List<String> list2 = list1.subList(0, 3);
		
		System.out.println(list2);

	}

}
