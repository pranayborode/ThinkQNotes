package com.asg5CollectionArraylist;

import java.util.LinkedList;

//40. Create linked list of 10 integers. Add a new element at 4th position.
public class Q40LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i= 1; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(4, 22);
		System.out.println(list);
	}

}
