package com.arraylist1cw;

import java.util.ArrayList;

//13.	WAP to empty ArrayList
public class Q13EmptyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>(5);
		
		al.add("Kiwi");
		al.add("Orange");
		al.add("Banana");
		al.add("Apple");
		al.add("Cherries");
		
		System.out.println("ArrayList Before: "+ al);
		
		al.clear();
		
		System.out.println("ArrayList After: "+al);

	}

}
