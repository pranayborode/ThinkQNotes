package com.asg4queuestackhw;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

//5.	Use 2 different method calls to remove non-existing elements from a queue	
public class Q5RmoveNonExistingElements {
	

	public static void main(String[] args) {

		Queue<String> colorQueue = new LinkedList<>();
		
		

		try {
			colorQueue.remove();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		// remove() method throws an exception when the queue is empty

		System.out.println(colorQueue);

		colorQueue.poll();
        // poll() method returns null to indicate that no element was removed

		System.out.println(colorQueue);

	}
}
