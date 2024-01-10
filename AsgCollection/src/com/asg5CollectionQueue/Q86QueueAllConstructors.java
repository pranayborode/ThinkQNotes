package com.asg5CollectionQueue;

import java.util.LinkedList;
import java.util.Queue;

//86. Create queue using all constructors.

public class Q86QueueAllConstructors {

	public static void main(String[] args) {

		Queue<String> queue1 = new LinkedList<>();
		System.out.println("queue1: " + queue1);

		Queue<String> queue2 = new LinkedList<>(queue1);
		System.out.println("queue2: " + queue2);

		Queue<String> queue3 = new LinkedList<>(queue2);
		System.out.println("queue3: " + queue3);

		Queue<String> queue4 = new LinkedList<>();

		queue4.add("One");
		queue4.add("Two");
		queue4.add("Three");
		System.out.println("queue4: " + queue4);

		Queue<String> queue5 = new LinkedList<>(queue4);
		System.out.println("queue5: " + queue5);

		
	}

}
