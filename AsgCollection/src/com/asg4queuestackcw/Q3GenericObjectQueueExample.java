package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//3.	WAP to create a Queue with user defined class objects &amp; using generics

class Color {
	private String name;

	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Color(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}

}

public class Q3GenericObjectQueueExample {

	public static void main(String[] args) {
		
		Queue<Color> colorQueue = new LinkedList<>();
		
		colorQueue.add(new Color("Red"));
		colorQueue.add(new Color("Blue"));
		colorQueue.add(new Color("Green"));
		colorQueue.add(new Color("Black"));
		
		
		System.out.println(colorQueue);

	}

}
