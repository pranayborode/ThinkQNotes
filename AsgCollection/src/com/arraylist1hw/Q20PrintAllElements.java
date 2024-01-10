package com.arraylist1hw;

import java.util.ArrayList;

//20.	WAP to print all the elements of an ArrayList using the position of the elements
public class Q20PrintAllElements {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		
		
		for(int i = 0; i<list1.size(); i++) {
			
			System.out.println("Position "+(i+1)+" : "+ list1.get(i));
		}

	}

}
