package com.asg3LinkedListcw;

import java.util.LinkedList;

//12.	WAP to remove a specified element from a linked list.
public class Q12RemoveSpecifiedElement {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");
		list1.add("Lotus");
		list1.add("BlueBell");
		list1.add("Sunflower");
		
		
		System.out.println(list1);
		
		list1.remove("Lotus");
		
		System.out.println(list1);

	}

}
