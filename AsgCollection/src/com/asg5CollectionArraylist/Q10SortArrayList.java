package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Collections;

//10. Sort arraylist of Strings.

public class Q10SortArrayList {

	public static void main(String[] args) {

		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Orange");
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Pineapple");
		stringList.add("Grapes");
		
		 System.out.println("ArrayList before sorting: " + stringList);
		 
		 Collections.sort(stringList);
		 
		 System.out.println("ArrayList after sorting: " + stringList);
	}

}
