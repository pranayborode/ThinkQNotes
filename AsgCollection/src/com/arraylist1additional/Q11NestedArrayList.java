package com.arraylist1additional;

import java.util.ArrayList;

//11.	Create arraylist ‘arrList’ within an arraylist. 
//      Use contains and containsall method to check if given element and arraylists are present in ‘arrList’
public class Q11NestedArrayList {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
		
		
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		
		ArrayList<Integer> list2 = new ArrayList<>();

		list2.add(3);
		list2.add(4);
		
		arrList.add(list1);
		arrList.add(list2);
		
		System.out.println(arrList);
		
		ArrayList<Integer> checkList = new ArrayList<>();

		checkList.add(3);
		checkList.add(4);
		
		System.out.println(arrList.contains(checkList)); //true
		
		System.out.println(arrList.containsAll(checkList)); //false
		
		
		
	}

}
