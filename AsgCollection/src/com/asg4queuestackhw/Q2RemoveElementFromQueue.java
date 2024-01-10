package com.asg4queuestackhw;

import java.util.Queue;
import java.util.LinkedList;

//2.	WAP to remove an element from a queue
public class Q2RemoveElementFromQueue {

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
