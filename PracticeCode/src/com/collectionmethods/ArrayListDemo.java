package com.collectionmethods;

import java.util.ArrayList;

// 1. Resizable array or growable array 
// 2. Duplicate objects are allowed
// 3. Insertion order preserved
// 4. Heterogeneous objects are allowed .(Except TreeSet and TreeMap .. it compare objects so..) 
// 5. Null insertion is possible


public class ArrayListDemo {

	public static void main(String[] args) {
		
		// we get here warning because we use here non generic syntax
		// we miss type sefty here 
		
		// Constructors 1
		ArrayList l1 = new ArrayList(); //defaultCapacity10
		//creates an empty array list object 
		
		// IMP //but with default initial capacity "10"
		
		//Up to JDK 6 the the capacity grow with formula newCapacity = (oldCapacity * 3/2) + 1.
		//In JDK 7 and above the formula changes to newCapacity = oldCapacity + (oldCapacity >> 1)
		
		l1.add("A");
		l1.add(10);
		l1.add("A");
		l1.add(null);
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		
		l1.add(2, "B");
		System.out.println(l1);
		
		l1.add(11);
		System.out.println(l1);
		
		
		// Constructors 2		
		ArrayList l2 = new ArrayList(100); // int initialCapacity
		// Creating an empty ArrayList object with specified initial capacity
		
		
		// Constructors 3
		ArrayList l3 = new ArrayList(l2); // Collection c
		// Creates an equivalent ArrayList object for the given collection 
		
		

	}

}
