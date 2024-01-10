package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.List;


//36. How to get sublist from an arraylist.
public class Q36SubListFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");
		
		System.out.println(list1);
		
		List<String> subList = list1.subList(1, 3);
		
		System.out.println(subList);

	}

}
