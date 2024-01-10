package com.asg5CollectionArraylist;

import java.util.ArrayList;

//7. Replace an element at particular position by given element.
public class Q7ReplaceElementsParticularPosition {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println(list);

		list.set(1, 66);
		System.out.println(list);
	}

}
