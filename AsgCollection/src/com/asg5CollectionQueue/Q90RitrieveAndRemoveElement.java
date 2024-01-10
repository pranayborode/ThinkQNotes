package com.asg5CollectionQueue;

import java.util.Iterator;
import java.util.LinkedList;

//90. How do you retrieve and remove an element from specific position of a linked list .
public class Q90RitrieveAndRemoveElement {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Lichi");

		System.out.println(list.get(2));

		list.remove(2);

		System.out.println(list);

	}

}
