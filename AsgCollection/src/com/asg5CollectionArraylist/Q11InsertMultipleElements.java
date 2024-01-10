package com.asg5CollectionArraylist;

import java.util.ArrayList;

//11. Insert more than one element at particular position in arraylist
public class Q11InsertMultipleElements  {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Orange");
		stringList.add("Apple");
		stringList.add("Banana");

		System.out.println("ArrayList before insertion: " + stringList);

		ArrayList<String> stringList2 = new ArrayList<>();

		stringList2.add("Pineapple");
		stringList2.add("Grapes");
		
		
		stringList.addAll(1, stringList2);
		
		System.out.println("ArrayList after insertion: " + stringList);

	}

}
