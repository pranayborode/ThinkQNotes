package com.asg5CollectionArraylist;

import java.util.ArrayList;

//1. Show in program, that size of an arraylist dynamically changes
public class Q1ArrayListDynamicSize {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println(list.size());

		list.add(4);
		list.add(null);

		System.out.println(list.size());
	}

}
