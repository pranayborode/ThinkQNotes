package com.arraylist1hw;

import java.util.ArrayList;


//11.	WAP to clone an ArrayList to another ArrayList
public class Q11CloneArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");

		@SuppressWarnings("unchecked")
		ArrayList<String> list2 =  (ArrayList<String>)list1.clone();
		
		System.out.println(list2);
		
		
		
		

		
		
		
		

	}

}
