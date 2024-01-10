package com.asg3LinkedListhw;

import java.util.LinkedList;

//9.	WAP to compare two linked lists.
public class Q9CompareTwoLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		

		System.out.println(list1);

		LinkedList<String> list2 = new LinkedList<>();

		list2.add("Java");
		list2.add("Python");
		list2.add("C++");

		System.out.println(list2);
		
		boolean areEqual = list1.equals(list2);
		
		System.out.println(areEqual);

	}

}
