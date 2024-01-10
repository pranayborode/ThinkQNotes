package com.arraylist1hw;

import java.util.ArrayList;

//16.	WAP to remove the third element from an ArrayList
public class Q16RemoveThirdElement {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		list1.add("six");
		
		int removeIndex = 2;
		
		list1.remove(removeIndex);
		
		System.out.println(list1);

	}

}
