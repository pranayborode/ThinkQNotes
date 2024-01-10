package com.asg3LinkedListcw;

import java.util.LinkedList;

//6.	WAP to insert elements into the linked list at the first and last position.

public class Q6InsertElementsAtFirstLastPos {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");

		System.out.println("List1: " + list1);
		
		list1.addFirst("Lotus");
		list1.addLast("Sunflower");
	
		
		System.out.println("List1: " + list1);

	}

}
