package com.asg3LinkedListhw;

import java.util.LinkedList;

//11.	WAP to replace an element in a linked list.
public class Q11ReplaceAnElement {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");
		
		System.out.println(list1);
		list1.set(2, "Hybernate");

		System.out.println(list1);
	}

}
