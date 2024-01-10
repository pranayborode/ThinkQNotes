package com.asg4queuestackhw;


import java.util.Scanner;

/*
 * 6.	WAP to implement your own implementation of Queue using an array internally
 */
class MyQueue {
	int front = -1, rear = -1;
	int que[];

	public MyQueue() {

		front++;
		rear++;
		que = new int[5];
	}

	boolean offer(int data) {
		if (rear < (que.length)) {
			que[rear] = data;
			rear++;
			return true;
		} else {
			System.out.println("Queue overflow");
			return false;
		}

	}

	boolean poll() {
		if (front == -1) {
			System.out.println("Queue is empty");
			return false;
		} else
		{
			front++;
			return true;
		}

	}

	void display() {
		if (front == rear)
			System.out.println("Queue is empty");
		else
			System.out.print("[");
			for (int i = front; i < rear; i++) {
				System.out.print(que[i] + " ,");
			}
			System.out.print("]");
		System.out.println();
	}

}

public class Q6QueueDataStructure {

	public static void main(String[] args) {

		MyQueue m1 = new MyQueue();
		 char ch;
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1.Add element ");
		System.out.println("2.Delete element");
		System.out.println("3.Display element");
	     choice=sc.nextInt();
	    
	     switch(choice)
	     {
	     case 1:
	    	 System.out.println("Enter element ");
	    	 if(  m1.offer(sc.nextInt()))
	    		 System.out.println("Element added");
	    	 
	    	   break;
	     case 2:
	    	 
	    	 if( m1.poll())
	    		 System.out.println("Element deleted");
	    	  break;
	     case 3:
	    	  m1.display();
	    	  break;
	    	  default:
	    		  System.out.println("Invalid choice");
	    		  break;
	     }
	     
	     System.out.println("Do you want to continue ?");
	      ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
