package com.asg5CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

//51. Create hashset of strings. Add 10 elements to the set. 
//    Iterate through hashset using iterator and for each loop.

public class Q51IteratorAndForEachLoop {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>(10);
		
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Six");
		hs.add("Seven");
		hs.add("Eight");
		hs.add("Nine");
		hs.add("Ten");
		
		System.out.println("Iterate Through Iterator");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("Iterate Through ForEach Loop");
		
		for(String s : hs) {
			System.out.println(s);
		}
		

	}

}
