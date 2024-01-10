package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Arrays;

//20. Write a java program to convert array to arraylist and arraylist to array
public class Q20ArrayToArrayListViceVersa {

	public static void main(String[] args) {
		
		String strArr[] = {"One", "Two", "Three"};
		
		System.out.println("Array: "+Arrays.toString(strArr));
		
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
		
		System.out.println("NewArrayList: "+arrayList);
		
		////////////////////////////////////////////////////////////////////////////
		
		String newArr[] = arrayList.toArray(new String[0]);
		
		System.out.println("NewArray: "+Arrays.toString(newArr));

	}

}
