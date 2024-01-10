package com.asg2comparable;

import java.util.ArrayList;
import java.util.Collections;

//1. WAP to sort the elements of List that contains String objects.
//   Print ArrayList.Sort using Collections.sort(list) method. Print ArrayList
public class Q1SortUsingCollectionsSort {

	public static void main(String[] args) {
		ArrayList<String> placeList = new ArrayList<>();

		placeList.add("Pune");
		placeList.add("Mumbai");
		placeList.add("Amravati");
		placeList.add("Delhi");
		placeList.add("Goa");
		
		Collections.sort(placeList);
		
		System.out.println(placeList);

	}

}
