package com.asg4queuestackhw;

import java.util.LinkedList;
import java.util.Queue;

//1.	WAP to check the top element in a queue
public class Q1CheckTopElementInQueue {

	public static void main(String[] args) {

		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.offer("Red");
		colorQueue.offer("Green");
		colorQueue.offer("White");
		colorQueue.offer("Black");
		colorQueue.offer("Purple");

		System.out.println(colorQueue);
		
		String topElement = colorQueue.peek();
		
		System.out.println(topElement);

	}

}
