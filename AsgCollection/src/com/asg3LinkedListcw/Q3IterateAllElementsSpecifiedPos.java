package com.asg3LinkedListcw;

import java.util.LinkedList;

//3.	WAP to iterate through all elements in a linked list starting at the specified position.
public class Q3IterateAllElementsSpecifiedPos {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");

		System.out.println("List1: " + list1);
		
		LinkedList<String> list2 = new LinkedList<>();

		list2.add("Lotus");
		list2.add("Sunflower");

		System.out.println("List2: " + list2);
		
		list1.addAll(1, list2);
		System.out.println("Appends all Elements: "+list1);


	}

}
