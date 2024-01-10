package com.arraylist1cw;

import java.util.ArrayList;

//1.	WAP to know how many elements in ArrayList
public class Q11CountElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		
		System.out.println(list1);
		
		int size = list1.size();
		
		System.out.println("Number of Elemnets in ArrayList: "+size);

	}

}
