package com.asg3LinkedListhw;

import java.util.LinkedList;

//6.	WAP to retrieve but does not remove, the last element of a linked list.
public class Q6RetrieveExceptLastElement {

	public static void main(String[] args) {
		

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");

		System.out.println(list1);
		
		System.out.println(list1.peekLast());
		
		System.out.println(list1);

	}

}
