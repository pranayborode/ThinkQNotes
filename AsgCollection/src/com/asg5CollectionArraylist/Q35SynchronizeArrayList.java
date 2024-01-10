package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//35. How to synchronize arraylist.
public class Q35SynchronizeArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Orange");
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Pineapple");
		
		
		List<String> synchronizedList = Collections.synchronizedList(stringList);
		
		synchronizedList.add("Kivi");
		synchronizedList.add("Grapes");
		
		
			for(String e: synchronizedList) {
				System.out.println(e);
			}
		
	}

}
