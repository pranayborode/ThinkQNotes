package com.asg2generalarraylist;

import java.util.ArrayList;

//16. Does ArrayList allow Null values
// and -  ArrayList can have any number of null elements.
public class ArrayListNullValue {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add(null);
		list1.add("Five");
		
		for(String s : list1) {
			System.out.println(s);
		}

	}

}
