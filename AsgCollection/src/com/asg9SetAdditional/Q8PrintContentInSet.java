package com.asg9SetAdditional;

import java.util.LinkedHashSet;
import java.util.Set;

//8.	Print the contents in the Set.

public class Q8PrintContentInSet {

	public static void main(String[] args) {
		

		Set<String> set1 = new LinkedHashSet<>();

		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");
		
		for(String s : set1) {
			System.out.println(s);
		}
		
		

	}

}
