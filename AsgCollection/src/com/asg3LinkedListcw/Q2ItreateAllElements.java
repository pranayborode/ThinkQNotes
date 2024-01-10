package com.asg3LinkedListcw;

import java.util.LinkedList;

//2.	WAP to iterate through all elements in a linked list.
public class Q2ItreateAllElements {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");

		System.out.println("List1: " + list1);
		
		LinkedList<String> list2 = new LinkedList<>();

		list2.add("Lotus");
		list2.add("Sunflower");

		System.out.println("List2: " + list2);
		
		list1.addAll(list2);
		System.out.println("Appends all of the elements: "+list1);

		
		
	}

}
