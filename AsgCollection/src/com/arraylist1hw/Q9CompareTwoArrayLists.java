package com.arraylist1hw;

import java.util.ArrayList;

//9.	WAP to compare two ArrayLists print if equal?
public class Q9CompareTwoArrayLists {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");

		boolean isEqual = list1.equals(list2);
		
		if(isEqual) {
			System.out.println("list1 and list2 are Equal");
		}else {
			System.out.println("list1 and list2 are not Equal");
		}
		

	}

}
