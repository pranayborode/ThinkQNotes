package com.asg2comparable;

import java.util.ArrayList;
import java.util.Collections;

//2. WAP to sort the elements of List that contains Integer objects.Print ArrayList.Sort using 
//Collections.sort(list) method.Print ArrayList.
//Note: In the above 2 assignments, sorting is achieved automatically as String as well as Wrapper 
//class Integer implements Comparable interface method compareTo.



public class Q2SortIntegerObjects {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(103);
		list.add(105);
		list.add(101);
		list.add(106);
		list.add(102);
		list.add(104);
		
		System.out.println(list);
		
		Collections.sort(list);

		System.out.println(list);
	}

}
