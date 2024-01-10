package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Collections;

//34. Reverse an arraylist of 10 integers.

public class Q34ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println(list);

		Collections.reverse(list);

		System.out.println(list);
	}

}
