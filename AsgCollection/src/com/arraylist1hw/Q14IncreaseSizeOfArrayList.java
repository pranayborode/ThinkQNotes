package com.arraylist1hw;

import java.util.ArrayList;

//14.	WAP to increase the size of an ArrayList
public class Q14IncreaseSizeOfArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>(10);

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");

		System.out.println(list1);
		System.out.println(list1.size());

		list1.add("Ten");
		System.out.println(list1);
		System.out.println(list1.size());

	}

}

//System.out.println(list1.size());
//list1.trimToSize();
//list1.ensureCapacity(2);
////list1.add("Ten");
//list1.set(5, "Six");
//System.out.println(list1);
