package com.asg4queuestackhw;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import com.arraylist1additional.Employee;

//
//7.	WAP to create a Queue using generics and add user defined class objects 
//      which does not implement comparable interface yet 
//element are added in sorted in natural order. Observe order whenre moving from queue

class Student implements Comparable<Student>{

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

	@Override
	public int compareTo(Student s) {
		
		if(this.getRollNo()==s.getRollNo()) {
			return 0;
		}else if (this.getRollNo()>s.getRollNo()) {
			return 1; 
		}
		return -1;
	}

	
	
}

public class Q7SortedQueueWithoutComparable  {

	public static void main(String[] args) {
		
		Queue<Student> stdQueue = new PriorityQueue<>();
		
		stdQueue.offer(new Student(103, "Rahul"));
		stdQueue.offer(new Student(101, "Amar"));
		stdQueue.offer(new Student(104, "Shital"));
		stdQueue.offer(new Student(102, "Umesh"));
		stdQueue.offer(new Student(105, "Purva"));
		stdQueue.offer(new Student(106, "Chetan"));
		
		
		
		System.out.println("Sorted Queue Contents: ");
	   
		 while (!stdQueue.isEmpty()) {
	            System.out.println(stdQueue.poll());
	        }
		
		
	}

}
