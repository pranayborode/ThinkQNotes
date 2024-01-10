package com.arraylist1hw;

import java.util.ArrayList;
import java.util.Collections;

//17.	WAP to shuffle elements in an ArrayList
public class Q17ShuffleElements {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("six");

		System.out.println("Original ArrayList: " + list1);

		Collections.shuffle(list1);

		System.out.println("After Shuffle: " + list1);

	}

}
