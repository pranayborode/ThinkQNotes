package com.arraylist1hw;

import java.util.ArrayList;


//13.	WAP to trim the capacity of an ArrayList the current list size
public class Q13TrimCapacityToCurrentListSize {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>(10);
		

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		
		System.out.println(list1.size());
        list1.trimToSize();
        list1.set(3, "Seven");
        System.out.println(list1);

	}

}
