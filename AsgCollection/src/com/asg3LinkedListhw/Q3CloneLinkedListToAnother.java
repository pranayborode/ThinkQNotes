package com.asg3LinkedListhw;

import java.util.LinkedList;

//3.	WAP to clone a linked list to another linked list.
public class Q3CloneLinkedListToAnother{

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");

		System.out.println(list1);

		LinkedList<String> list2 = (LinkedList<String>)list1.clone();
		
		list1.add("C");
		
		System.out.println("original: "+list1);
		System.out.println("Clone: "+list2);
		
		

	}

}
