package com.asg9SetCW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//3.	WAP to create a HashSet from an ArrayList
public class Q3ArrayListHashSet {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Java");
		list1.add("C++");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add(".Net");
		list2.add("Python");

		HashSet<ArrayList<String>> hs = new HashSet<>();
		hs.add(list1);
		hs.add(list2);

		System.out.println(hs);
		
		Iterator<ArrayList<String>> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
