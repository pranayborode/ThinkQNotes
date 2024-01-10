package com.asg3LinkedListcw;

import java.util.LinkedList;

//11.	WAP to display the elements and their positions in a linked list.
public class Q11DisplayElementsWithPosition {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<>();

		list1.add("Rose");
		list1.add("Lily");
		list1.add("Marigold");
		list1.add("Lotus");
		list1.add("BlueBell");
		list1.add("Sunflower");
		
		for(int i = 0; i<list1.size(); i++) {
			
			System.out.println(list1.get(i)+ " Index: "+i);
		}

	}

}
