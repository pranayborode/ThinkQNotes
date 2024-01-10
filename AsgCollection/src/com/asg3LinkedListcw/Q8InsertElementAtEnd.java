package com.asg3LinkedListcw;

import java.util.LinkedList;

//8.	WAP to insert the specified element at the end of a linked list.
public class Q8InsertElementAtEnd {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");

		System.out.println("List1: " + list1);
		
		list1.addLast("Sunflower");
	
		
		System.out.println("List1: " + list1);

	}

}
