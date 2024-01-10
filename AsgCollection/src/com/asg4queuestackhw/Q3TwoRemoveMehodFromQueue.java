package com.asg4queuestackhw;

import java.util.LinkedList;
import java.util.Queue;

//3.	Use 2 different method calls to remove elements from a queue
public class Q3TwoRemoveMehodFromQueue {

	public static void main(String[] args) {
		
		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.offer("Red");
		colorQueue.offer("Green");
		colorQueue.offer("White");
		colorQueue.offer("Black");
		colorQueue.offer("Purple");

		System.out.println(colorQueue);

		colorQueue.remove("Green");

		System.out.println(colorQueue);

		colorQueue.poll();
		System.out.println(colorQueue);

	}

}
