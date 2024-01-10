package com.asg3LinkedListhw;

import java.util.LinkedList;

//2.	WAP to join two linked lists
public class Q2JoinTwoLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");

		System.out.println(list1);

		LinkedList<String> list2 = new LinkedList<>();

		list2.add("PHP");
		list2.add("Dart");
		list2.add("Flutter");

		System.out.println(list2);
		
		list1.addAll(list2);
		
		System.out.println(list1);

	}

}
