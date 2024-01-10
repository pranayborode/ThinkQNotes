package com.asg5CollectionQueue;

import java.util.LinkedList;

//91. How do you retrieve but not remove an element from linked list.

public class Q91RetrieveButNotRemove {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Lichi");
		
		System.out.println(list.element());
		
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());

	}

}
