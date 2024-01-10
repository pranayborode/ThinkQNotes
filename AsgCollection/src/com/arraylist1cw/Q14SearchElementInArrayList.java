package com.arraylist1cw;

import java.util.ArrayList;

//14.	WAP to search an element from ArrayList
public class Q14SearchElementInArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Amravati");
		list1.add("Nagpur");
		list1.add("Thane");
		list1.add("Akola");

		System.out.println(list1.contains("Amravati"));

	}

}
