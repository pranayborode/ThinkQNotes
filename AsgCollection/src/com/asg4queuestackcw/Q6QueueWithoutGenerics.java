package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//6.	WAP to create a Queue with Integer objects without using generics
public class Q6QueueWithoutGenerics {

	public static void main(String[] args) {
		
		Queue queue = new LinkedList();
		
		queue.add(1);
		queue.offer(2);
		queue.add(3);
		queue.offer(4);
		
		System.out.println(queue);

	}

}
