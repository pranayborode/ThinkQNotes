package com.arraylist1cw;

import java.util.ArrayList;

//21.	WAP to convert collection into array
public class Q21ConvertCollectionIntoArray {

	public static void main(String[] args) {
		
		ArrayList<String> fruitList = new ArrayList<>();
		
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");

		
		String fruitArray[] = new String[fruitList.size()];
		
		fruitList.toArray(fruitArray);
		
		for(String f : fruitArray) {
			System.out.println(f);
		}
	}

}
