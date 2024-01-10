package com.arraylist1cw;

import java.util.ArrayList;

//5.	WAP to iterate through all elements in an ArrayList using for loop
public class Q5IterateThroughLoop {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Amravati");
		list1.add("Nagpur");

		
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}

}
