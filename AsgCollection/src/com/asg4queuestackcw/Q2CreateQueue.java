package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//2.	WAP to create a Queue with some colors (String) &amp; using generics
public class Q2CreateQueue {

	public static void main(String[] args) {
		
		Queue<String> colorQueue = new LinkedList<>();
		
		colorQueue.add("Red");
		colorQueue.add("Blue");
		colorQueue.add("Green");

		System.out.println(colorQueue);
	}

}
