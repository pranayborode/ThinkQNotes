package com.asg3LinkedListcw;

import java.util.LinkedList;
import java.util.ListIterator;

//4.	WAP to iterate a linked list in reverse order.
public class Q4IterateReverseOrder {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");

		System.out.println("List1: " + list1);
		
		ListIterator<String> lir = list1.listIterator(list1.size());
		
		while(lir.hasPrevious()) {
			System.out.println(lir.previous());
		}

	}

}
