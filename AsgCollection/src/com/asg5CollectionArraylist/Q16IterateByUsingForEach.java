package com.asg5CollectionArraylist;

import java.util.ArrayList;

//16. Iterate through arraylist using foreach . 

public class Q16IterateByUsingForEach {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Orange");
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Pineapple");
		stringList.add("Grapes");
		
		for(String i : stringList) {
			System.out.println(i);
		}

	}

}
