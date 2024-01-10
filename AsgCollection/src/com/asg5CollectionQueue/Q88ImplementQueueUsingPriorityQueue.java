package com.asg5CollectionQueue;

import java.util.PriorityQueue;
import java.util.Queue;

//88. Implement queue interface using priority queue.
public class Q88ImplementQueueUsingPriorityQueue {

	public static void main(String[] args) {
		
		Queue<String> queue1 = new PriorityQueue<>();
		
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		
		System.out.println(queue1);
		

	}

}
