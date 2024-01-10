package com.asg5CollectionQueue;

import java.util.LinkedList;
import java.util.Queue;

//87. Implement queue interface using linked list.


public class Q87ImplementQueueUsingLInkedList {

	public static void main(String[] args) {
		
		Queue<String> queue1 = new LinkedList<>();
		
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		queue1.add("Four");
		
		int  i = queue1.size();
		System.out.println(i);
		
		System.out.println(queue1);

	}

}
