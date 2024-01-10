package com.asg3LinkedListhw;

import java.util.Collections;
import java.util.LinkedList;

//1.	WAP to shuffle the elements in a linked list.
public class Q1ShuffleElements {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");

		System.out.println(list1);

		Collections.shuffle(list1);
		
		System.out.println(list1);

	}

}
