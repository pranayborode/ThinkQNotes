package com.arraylist1hw;

import java.util.ArrayList;

//6.	WAP to use add all elements to ArrayList
public class Q6AddElements {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(12);
		list1.add(22);
		list1.add(41);
		list1.add(34);

		ArrayList<Integer> list2 = new ArrayList<>();

		list2.add(48);
		list2.add(29);
		list2.add(53);
		list2.add(88);

		System.out.println("List1 before adding: " + list1);
		System.out.println("List2 before adding: " + list2);

		list1.addAll(list2);

		System.out.println("List1 before adding: " + list1);
		System.out.println("List2 before adding: " + list2);

	}

}
