package com.asg4queuestackcw;

//9.	WAP to create a Queue using generics and add user defined class objects 
//      which implements comparable interface. Observe order when removing from queue.

import java.util.Queue;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Employee implements Comparable<Employee>{
	
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
	
	
	
	@Override
	public int compareTo(Employee e) {
		
		return this.getName().compareTo(e.getName());
	}
	
	
	
}

public class Q9QueueWithComparableInterface {

	public static void main(String[] args) {
		
		Queue<Employee> empQueue = new LinkedList<>();
		
		empQueue.offer(new Employee(103, "Rahul"));
		empQueue.offer(new Employee(101, "Amar"));
		empQueue.offer(new Employee(104, "Shital"));
		empQueue.offer(new Employee(102, "Umesh"));
		empQueue.offer(new Employee(105, "Purva"));
		empQueue.offer(new Employee(106, "Chetan"));
		
		for(Employee e : empQueue) {
			System.out.println(e);
		}
		System.out.println("------------------------------------------");
		
		Collections.sort((List<Employee>) empQueue);
		
		for(Employee e : empQueue) {
			System.out.println(e);
		}
		

	}

}
