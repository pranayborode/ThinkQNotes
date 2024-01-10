package com.asg5CollectionSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//54. Create a treeset of 6 strings. Find the index of string given by user. 

public class Q54FindIndexOfTreeSet {

	static void findIndex(TreeSet<String> ts, String str) {
		
		int index = 0;
		for(String s : ts) {
			
			if(s.equals(str)) {
				 System.out.println("Index of User input "+str+" in TreeSet is "+index);
			}
			index++;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("One");
		ts.add("Two");
		ts.add("Three");
		ts.add("Four");
		ts.add("Five");
		ts.add("Six");
		
		System.out.println(ts);
		System.out.println("Enter String to Find Index");

		String str = sc.next();
		
		findIndex(ts, str);
	}

}
