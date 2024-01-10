package com.asg5CollectionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//53. Study difference between hashset , linked hashset and treeset. Show one example of each. 
public class Q53AllSetExample {

	public static void main(String[] args) {
		
		System.out.println("==========HashSet============");
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		
		System.out.println(hs);
		
		System.out.println("=======LinkedHashSet=========");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("Five");
		
		System.out.println(lhs);
		
		System.out.println("===========TreeSet===========");
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("One");
		ts.add("Two");
		ts.add("Three");
		ts.add("Four");
		ts.add("Five");
		
		System.out.println(ts);

	}

}
