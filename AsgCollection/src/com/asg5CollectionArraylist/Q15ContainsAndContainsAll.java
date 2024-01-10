package com.asg5CollectionArraylist;

import java.util.ArrayList;

//15. Create arraylist ‘arrList’ within an arraylist. Use contains and 
//containsall method to check if given individual element and arraylists are present in ‘arrList’

public class Q15ContainsAndContainsAll {

	public static void main(String[] args) {

		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Orange");
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Pineapple");
		stringList.add("Grapes");

		System.out.println(stringList);

		System.out.println(stringList.contains("Apple")); // true

		System.out.println(stringList.contains("Kivi")); // false

		ArrayList<String> checkList = new ArrayList<>();

		checkList.add("Orange");
		checkList.add("Banana");
		checkList.add("Grapes");
		
		System.out.println(checkList);
		
		boolean check1 = stringList.containsAll(checkList);
		System.out.println(check1);

	}

}
