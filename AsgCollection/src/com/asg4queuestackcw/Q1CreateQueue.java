package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//1.	WAP to create a Queue with Integer objects without using generics
public class Q1CreateQueue {

	public static void main(String[] args) {
		
		Queue que = new LinkedList();
		
		que.add("Red");
		que.add("Blue");
		que.add("Orange");
		
		System.out.println(que);
		

	}

}
