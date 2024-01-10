package com.arraylist1cw;

import java.util.ArrayList;

//15.	WAP to search the specified collection in this collection
public class Q15SearchSpecifiedColection {

	public static void main(String[] args) {
		

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Amravati");
		list1.add("Nagpur");
		list1.add("Thane");
		list1.add("Akola");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Amravati");
		list2.add("Pune");
		
		boolean search = list1.containsAll(list2);
		
		if(search) {
		System.out.println("List1 is present in list1");
		}else {

			System.out.println("List1 is not present in list1");
		}
		

	}

}
