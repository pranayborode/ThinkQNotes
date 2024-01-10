package com.asg3LinkedListcw;

import java.util.LinkedList;

//10.	WAP to get the first and last occurrence of the specified elements in a linked list.
public class Q10GetFirstAndLastOccurrence {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("BlueBell");
		list1.add("Marigold");
		list1.add("Lotus");
		list1.add("BlueBell");
		list1.add("Sunflower");
		
		
		System.out.println(list1.indexOf("BlueBell"));
		
		System.out.println(list1.lastIndexOf("BlueBell"));
		

	}

}
