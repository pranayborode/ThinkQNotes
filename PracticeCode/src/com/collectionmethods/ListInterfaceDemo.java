package com.collectionmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		List<Integer> list2 = new ArrayList<>();

		list2.add(6);
		list2.add(2);
		list2.add(7);
		list2.add(4);
		list2.add(8);
		
		
		// all methods of Collection Interface present in ListInterface 
		// additional it has its own methods this are-
		
		list1.add(3, 0); // returnType - void               
		//Inserts the specified element at the specified position in this list
		System.out.println(list1);
		
		list1.addAll(4, list2);  // returnType - boolean
		//Inserts all of the elements in the specified collection into thislist at the specified position
		System.out.println(list1);
		
		int i = list1.get(3); //returnType - Object
		//Returns the element at the specified position in this list.
		System.out.println(i);
		
		list1.set(0, 99); //returnType - Object
		//Replaces the element at the specified position in this list with thespecified element
		System.out.println(list1);
		
		list1.remove(0); //returnType - Object
		System.out.println(list1);//Removes the element at the specified position in this list
		
		int firstIndex = list1.indexOf(2); //returnType - Int
		System.out.println(firstIndex);//Returns the index of the first occurrence of the specified elementin this list
		
		int lastIndex = list1.lastIndexOf(2); //returnType - Int
		System.out.println(lastIndex); //Returns the index of the last occurrence of the specified elementin this list
		
		ListIterator<Integer>li = list1.listIterator(); //returnType - ListIterator
		//Returns a list iterator over the elements in this list (in propersequence).
		
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}

	}

}
