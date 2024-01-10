package com.asg4queuestackhw;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
8.	WAP to create a Queue using generics and add user defined 
class objects in reverse order using comparator. Observe order when removing from queue.*/

class Employee {

	private int id;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class Q8ReverseOrderQueue {

	public static void main(String[] args) {

		Queue<Employee> empQueue = new LinkedList<>();

		empQueue.add(new Employee(103, "Rahul"));
		empQueue.add(new Employee(101, "Amar"));
		empQueue.add(new Employee(104, "Shital"));
		empQueue.add(new Employee(102, "Umesh"));
		empQueue.add(new Employee(105, "Purva"));
		empQueue.add(new Employee(106, "Chetan"));

		System.out.println(empQueue);

		while (!empQueue.isEmpty()) {
			System.out.println(empQueue.poll().getName());

		

		}

	}
}
