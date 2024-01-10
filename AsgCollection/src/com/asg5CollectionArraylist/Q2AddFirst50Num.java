package com.asg5CollectionArraylist;

import java.util.ArrayList;

//2. Create a arraylist of integers. Add first 50 odd numbers to arraylist. 
public class Q2AddFirst50Num {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {

			if (i % 2 != 0) {
				list.add(i);
			}
		}

		System.out.println(list);
	}

}
