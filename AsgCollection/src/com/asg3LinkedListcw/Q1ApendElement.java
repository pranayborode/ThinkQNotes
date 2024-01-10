package com.asg3LinkedListcw;

import java.util.LinkedList;

//1.	WAP to append the specified element to the end of a linked list.
public class Q1ApendElement {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Rose");
		list.add("Lily");
		
		System.out.println("Before: "+list);
		
		list.addLast("Lotus");

		System.out.println("Before: "+list);
	}

}
