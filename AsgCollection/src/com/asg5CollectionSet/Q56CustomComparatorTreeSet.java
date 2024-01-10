package com.asg5CollectionSet;

import java.util.Comparator;
import java.util.TreeSet;

//56. Create treeset using constructor which accepts comparater as input argument.

public class Q56CustomComparatorTreeSet  {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

		ts.add("Apple");
        ts.add("Banana");
        ts.add("Orange");
        ts.add("Grapes");
        ts.add("Cherry");
        
        System.out.println(ts);
	}

}
