package com.asg5CollectionArraylist;

import java.util.ArrayList;

//37. Sort arraylist of integers without using sort method.
public class Q37ShortArrayList {

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

		list.add(3);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		
		System.out.println("Before sort: " + list);
		sortArray(list);
		System.out.println("After sort: " + list);

	}

}
