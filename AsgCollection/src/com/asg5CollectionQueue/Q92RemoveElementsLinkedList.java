package com.asg5CollectionQueue;

import java.util.LinkedList;

//92. How do you remove elements from linked list.

public class Q92RemoveElementsLinkedList {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Peach");
		linkedList.add("Orange");
		linkedList.add("Mango");
		linkedList.add("Grapes");
		linkedList.add("Kivi");
		linkedList.add("Papaya");
		linkedList.add("Peach");
		linkedList.add("Pineapple");
		
		System.out.println(linkedList);
		
		linkedList.remove(); //Retrieves and removes the head (first element) of this list.
		System.out.println("remove() : "+linkedList);
		
		linkedList.remove(1); //Removes the element at the specified position in this list.
		System.out.println("remove(index) : "+linkedList);
		
		linkedList.remove("Orange"); //Removes the first occurrence of the specified element from this list
		System.out.println("remove(Object o) :"+linkedList);
		
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		
		linkedList2.add("Mango");
		linkedList2.add("Grapes");
		
		linkedList.removeAll(linkedList2);
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		linkedList.removeLastOccurrence("Peach");
		System.out.println(linkedList);
		

	}

}
