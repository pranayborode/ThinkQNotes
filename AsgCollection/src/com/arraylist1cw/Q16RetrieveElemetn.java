package com.arraylist1cw;

import java.util.ArrayList;

//16.	WAP to retrieve an element (at a specified index) from a given ArrayList
public class Q16RetrieveElemetn {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Amravati");
		list1.add("Nagpur");
		list1.add("Thane");
		list1.add("Akola");
		
		System.out.println(list1.get(2));
		

	}

}
