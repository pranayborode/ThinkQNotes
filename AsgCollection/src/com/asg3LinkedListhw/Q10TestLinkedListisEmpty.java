package com.asg3LinkedListhw;

import java.util.LinkedList;

//10.	WAP to test a linked list is empty or not.

public class Q10TestLinkedListisEmpty {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");
		
		
	boolean isEmptyList = list1.isEmpty();
	System.out.println(isEmptyList);

	}

}
