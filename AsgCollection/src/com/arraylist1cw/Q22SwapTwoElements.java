package com.arraylist1cw;

import java.util.ArrayList;

import java.util.Collections;

//22.	WAP of swap two elements in an ArrayList
public class Q22SwapTwoElements {

	public static void main(String[] args) {

		ArrayList<String> fruitList = new ArrayList<>();

		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Pineapple");

		System.out.println("Array list before swap: " + fruitList);

		Collections.swap(fruitList, 0, 1);

		System.out.println("Array list after swap: " + fruitList);

	}

}
