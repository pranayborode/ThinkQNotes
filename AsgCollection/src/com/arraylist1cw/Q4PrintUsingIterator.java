package com.arraylist1cw;

import java.util.ArrayList;
import java.util.Iterator;

//4.	WAP to print all elements of ArrayList using iterator
public class Q4PrintUsingIterator{

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Pune");
		list1.add("Mumbai");
		list1.add("Amravati");
		list1.add("Nagpur");
		
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
