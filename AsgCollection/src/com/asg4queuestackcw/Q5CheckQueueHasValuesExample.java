package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//5.	WAP to check if a queue has values
public class Q5CheckQueueHasValuesExample {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		System.out.println(queue.isEmpty());  //true

		queue.add("Red");
		queue.add("Blue");

		queue.offer("White");
		queue.offer("Black");

		System.out.println(queue);
		System.out.println(queue.isEmpty());//false
	}

}
