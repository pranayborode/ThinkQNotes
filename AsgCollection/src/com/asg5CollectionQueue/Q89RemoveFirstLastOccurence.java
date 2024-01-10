package com.asg5CollectionQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//89. How do you remove first occurrence and last occurance of given element in linked list which implements queue.

public class Q89RemoveFirstLastOccurence {
	
	public static void removeOccurrence(Queue<String> queue, String element) {
		
		queue.remove(element); // Remove the first occurrence
		
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(element)) {
				iterator.remove();
				break;
			}
		}
		
		
	}
	

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.offer("apple");
		queue.offer("banana");
		queue.offer("orange");
		queue.offer("banana");
		queue.offer("kiwi");

		System.out.println("Original: "+queue);
		
		removeOccurrence(queue,"banana");
		
		System.out.println("New : "+queue);

	}

}
