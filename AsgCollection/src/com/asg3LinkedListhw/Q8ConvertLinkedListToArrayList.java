package com.asg3LinkedListhw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//8.	WAP to convert a linked list to array list.

public class Q8ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Java");
		list1.add("Python");
		list1.add("C++");
		list1.add("Android");

		System.out.println(list1);
		
		ArrayList<String>arrList = new ArrayList<>(list1);
		
		System.out.println(arrList);

	}

}
