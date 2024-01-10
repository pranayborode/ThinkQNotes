package com.asg3LinkedListcw;

import java.util.LinkedList;

//9.	WAP to insert some elements at the specified position into a linked list.
public class Q9InsertSomeElementsAtSpecifiedPos {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");

		System.out.println("List1: " + list1);

		list1.add(1, "Lotus");
		list1.add(2, "Sunflower");

		System.out.println("List1: " + list1);

		list1.add(2, "BlueBell");

		System.out.println("List1: " + list1);

	}

}
