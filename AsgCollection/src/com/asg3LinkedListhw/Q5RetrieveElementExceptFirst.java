package com.asg3LinkedListhw;

import java.util.LinkedList;

//5.	WAP to retrieve but does not remove, the first element of a linked list.
public class Q5RetrieveElementExceptFirst {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");

		System.out.println(list1);
		
		System.out.println(list1.peek());
		
		System.out.println(list1);
	}

}
