package com.asg5CollectionSet;

import java.util.HashMap;
import java.util.HashSet;

//45. Create hashset by using all constructors of hashset class

public class Q45ConstructorsOfHashSet {

	public static void main(String[] args) {
		
		//// 1. Using the default constructor
		HashSet<Integer> hs1 = new HashSet<>();
		
		hs1.add(12);
		hs1.add(76);
		hs1.add(83);
		
		System.out.println(hs1);
		
		// // 2. Using the constructor with initial capacity
		HashSet<String> hs2 = new HashSet<>(5);
		
		hs2.add("One");
		hs2.add("Two");
		hs2.add("Three");
		hs2.add("Four");
		hs2.add("Five");
		
		System.out.println(hs2);
		
		System.out.println(hs2.size());
		
		 // 3. Using the constructor with an existing collection
		HashSet<String> hs3 = new HashSet<>(hs2);
		
		System.out.println(hs3);
		
		 // 4. Using the constructor with initial capacity and load factor
		HashSet<String> hs4 = new HashSet<>(10, 0.75f);
		
		hs4.addAll(hs2);
		
		System.out.println(hs4);
		

	}

}
