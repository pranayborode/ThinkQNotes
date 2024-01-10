package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//7.	WAP to create a Queue with some colors (String) &amp; using generics
public class Q7QueueWithGenerics {

	public static void main(String[] args) {
		
		Queue<String> colorQueue = new LinkedList<>();
		
		colorQueue.offer("Red");
		colorQueue.offer("Green");
		colorQueue.offer("White");
		
		System.out.println(colorQueue);

	}

}
