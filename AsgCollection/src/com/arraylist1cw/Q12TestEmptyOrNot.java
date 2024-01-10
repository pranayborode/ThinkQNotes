package com.arraylist1cw;

import java.util.ArrayList;

//12.	WAP to test an ArrayList is empty or not
public class Q12TestEmptyOrNot {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>(5);

		System.out.println(al.isEmpty());
		
		al.add("Kiwi");
		al.add("Orange");
		al.add("Banana");
		al.add("Apple");
		al.add("Cherries");
		
		System.out.println(al.isEmpty());

	}

}
