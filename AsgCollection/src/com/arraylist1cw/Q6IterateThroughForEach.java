package com.arraylist1cw;

import java.util.ArrayList;

//6.	WAP to iterate through all elements in an ArrayList using for each
public class Q6IterateThroughForEach {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Java");
		list1.add("C++");
		list1.add("Python");
		list1.add("Android");
		list1.add("Flutter");
		
		for(String s : list1) {
			System.out.println(s);
		}
		
	}

}
