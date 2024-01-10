package com.arraylist1additional;

import java.util.ArrayList;

//4.	Create arraylist of 10 integers. Insert an element at 7th position.
public class Q4IntegerArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println(list);
		
		list.add(6, 11);
		
		System.out.println(list);

	}

}
