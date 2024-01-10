package com.arraylist1cw;

import java.util.ArrayList;


//23.	WAP to replace the second element of an ArrayList with the specified element
public class Q23ReplaceSecondElement {

	public static void main(String[] args) {

		ArrayList<String> fruitList = new ArrayList<>();

		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Pineapple");

		System.out.println("Array list before swap: " + fruitList);

		fruitList.set(1, "Grapes");
		System.out.println("Array list before swap: " + fruitList);

	}

}
