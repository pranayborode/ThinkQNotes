package com.asg5CollectionArraylist;

import java.util.LinkedList;

//41. Add heterogeneous elements to linked list

public class Q41AddHetrogeneousElements {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<>();

		list.add("A");
		list.add(12);
		list.add(14.4f);
		list.add(99);
		list.add('a');

		System.out.println(list);

	}

}
