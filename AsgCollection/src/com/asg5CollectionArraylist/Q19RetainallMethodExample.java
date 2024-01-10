package com.asg5CollectionArraylist;

import java.util.ArrayList;

//9. Show use of retainall method of arraylist 
public class Q19RetainallMethodExample {

	public static void main(String[] args) {

		ArrayList<String> stringList1 = new ArrayList<>();

		stringList1.add("One");
		stringList1.add("Two");
		stringList1.add("Three");
		stringList1.add("Four");
		
		
		ArrayList<String> stringList2 = new ArrayList<>();

		stringList2.add("Nine");
		stringList2.add("Two");
		stringList2.add("Three");
		stringList2.add("Seven");
		stringList2.add("Eleven");
		
		stringList1.retainAll(stringList2); 
		//Retains only the elements in this list that are contained in the specified collection
		
		System.out.println(stringList1);

	}

}
