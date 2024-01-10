package com.asg9SetCW;

import java.util.Iterator;
import java.util.LinkedHashSet;

//8.	Do all above assignments using LinkedHashSet

public class Q8LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");

		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
