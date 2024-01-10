package com.asg3LinkedListcw;

import java.util.LinkedList;

//5.	WAP to insert the specified element at the specified position in the linked list.
public class Q5InsertElementSpecifiedPosition {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");

		System.out.println("List1: " + list1);

		list1.add(1, "Lotus");
		
		System.out.println("List1: " + list1);
	}

}
