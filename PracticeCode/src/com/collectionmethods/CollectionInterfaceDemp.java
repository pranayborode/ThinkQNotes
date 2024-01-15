package com.collectionmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionInterfaceDemp {

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
		
		//list1.addAll(list2); //[1, 2, 3, 4, 5, 6, 2, 7, 4, 8]  // returnType - boolean
		
		//list1.addAll(list2); //Appends all of the elements in the specified collection to the end ofthis list 
		                     // returnType - boolean
		
		//list1.remove(3); //remove object present at index from list  // returnType - boolean
		
		//list1.removeAll(list2); //remove all common object of list1 and list2 from list1;  
		                          //[1, 3, 5]   // returnType - boolean
		
	//	list1.retainAll(list2); // to remove all objects except those present in list2; // returnType - boolean
		
		//list1.clear(); // to delete all the objects  // returnType - void
		
		//****************************************************************
		
		boolean b = list1.contains(2); // returnType - boolean
		System.out.println(b);  // Returns true if this list contains the specified element
		
		boolean b1 = list1.containsAll(list2); // returnType - boolean 
		System.out.println(b1); //Returns true if this list contains all of the elements of thes pecified collection
		
		boolean b2 = list1.isEmpty();// returnType - boolean
		System.out.println(b2); //Returns true if this list contains no elements.
		
		list1.toArray(); // returnType - Object[]
		//Returns an array containing all of the elements in this list in propersequence (from first to last element).
		
		int size = list1.size(); // returnType - int 
		
		System.out.println(size);
		
		System.out.println(list1);
		
		Iterator<Integer>iterator = list1.iterator(); // Cursor //// returnType - Iterator
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
