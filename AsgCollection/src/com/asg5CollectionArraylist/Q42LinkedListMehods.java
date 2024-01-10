package com.asg5CollectionArraylist;

import java.util.LinkedList;

//42. Show use of addfirst , addlast, getfirst, getlast, remove first, remove last methods of linked list.

public class Q42LinkedListMehods {

	public static void main(String[] args) {
		

		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(14);
		list.add(32);
		list.add(75);
		list.add(44);
		list.add(58);
		list.add(12);
		
		System.out.println(list);
		
		list.addFirst(100);
		System.out.println("addFirst: "+list);
		
		list.addLast(200);
		System.out.println("addLast: "+list);
		
		System.out.println("getFirst: "+list.getFirst());
		
		System.out.println("getLast : "+list.getLast());
		
		list.removeFirst();
		System.out.println("removeFirst: "+list);
		
		list.removeLast();
		System.out.println("removeLast: "+list);

	}

}
