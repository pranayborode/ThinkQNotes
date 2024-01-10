package com.asg6CollectionMasterAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Write a code to remove duplicate elements from above list. Final arraylist should contain 
// ( Sun, Mon, Sat);
public class Q14RemoveDuplicateArrayList {
	
	public static void removeDuplicate(ArrayList<String> al) {
		
		HashSet<String>hashSet = new HashSet<>(al);
		
		
		System.out.println(hashSet);
		
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		
		removeDuplicate(al);

	}

}
