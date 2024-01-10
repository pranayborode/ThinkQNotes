package com.arraylist1cw;


import java.util.ArrayList;

//7.WAP to create a new ArrayList, add some colors (string) and print the collection.
public class Q7ColorsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Red");
		list1.add("Orange");
		list1.add("Yello");
		list1.add("Blue");
		
	    for(String s : list1) {
	    	System.out.println(s);
	    }

	}

}
