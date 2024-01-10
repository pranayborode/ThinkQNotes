package com.asg4queuestackcw;

import java.util.LinkedList;
import java.util.Queue;

//8.	WAP to create a Queue using generics and add user defined class objects 
//      which does not implement comparable interface.

class Student {

	private int rollNo;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}

public class Q8QueueWithCassObjects {

	public static void main(String[] args) {
		
		Queue<Student> stdQueue = new LinkedList<>();
		
		stdQueue.offer(new Student(101, "Sahil"));
		stdQueue.offer(new Student(102,"Priya"));
		
		for(Student s : stdQueue) {
			System.out.println(s);
		}

	}

}
