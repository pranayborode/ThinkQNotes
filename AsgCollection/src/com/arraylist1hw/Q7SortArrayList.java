package com.arraylist1hw;

import java.util.ArrayList;

//7.	WAP to sort a given ArrayList
public class Q7SortArrayList {

	public static void sortArray(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);

				}
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(14);
		list.add(32);
		list.add(75);
		list.add(44);
		list.add(58);
		list.add(12);
		System.out.println("Before sort: " + list);
		sortArray(list);
		System.out.println("After sort: " + list);

	}

}
