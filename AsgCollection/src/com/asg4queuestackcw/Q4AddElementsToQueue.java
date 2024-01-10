package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//4.	Use 2 different method calls to add elements to a queue.

public class Q4AddElementsToQueue {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Red");
		queue.add("Blue");
		
		queue.offer("Orange");
		queue.offer("Green");
		
		System.out.println(queue);
		
		

	}

}
