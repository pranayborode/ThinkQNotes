package com.asg5CollectionArraylist;

import java.util.LinkedList;
import java.util.ListIterator;

//39. Iterate through linked list using descending iterator.
public class Q39LinkedIteratorDescending {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(14);
		list.add(32);
		list.add(75);
		list.add(44);
		list.add(58);
		list.add(12);
		
		ListIterator<Integer> lit = list.listIterator(list.size());
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		

	}

}
