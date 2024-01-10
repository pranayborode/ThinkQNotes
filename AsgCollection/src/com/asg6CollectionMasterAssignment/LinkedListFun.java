package com.asg6CollectionMasterAssignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

//10 .What is the output of the progra
public class LinkedListFun {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Jan");
		ll.add("Feb");
		ll.add("Apr");
		ll.add("Jan");
		Collections.sort(ll);
		ListIterator itr = ll.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		ll.add(2, "August");
		while (itr.hasNext()) {                 //Exception in thread "main" java.util.ConcurrentModificationException
			System.out.println(itr.next());
		}
	}

}
