package com.asg5CollectionArraylist;

import java.util.LinkedList;

//44. How do you get last occurance of given element in linked list.

public class Q44LastOccuranceOfLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(14);
		list.add(58);
		list.add(75);
		list.add(44);
		list.add(58);
		list.add(12);

		System.out.println(list);

		int lastIndex = list.lastIndexOf(58);
		
		System.out.println(lastIndex);

	}

}
