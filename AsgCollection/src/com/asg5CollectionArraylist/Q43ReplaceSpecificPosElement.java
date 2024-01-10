package com.asg5CollectionArraylist;

import java.util.LinkedList;

//43. Replace an element at specific position in linked list.

public class Q43ReplaceSpecificPosElement {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(14);
		list.add(32);
		list.add(75);
		list.add(44);
		list.add(58);
		list.add(12);

		System.out.println(list);
		
		list.set(2, 100);
		
		System.out.println(list);
	}

}
