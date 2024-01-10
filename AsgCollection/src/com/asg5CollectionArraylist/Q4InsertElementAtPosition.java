package com.asg5CollectionArraylist;

import java.util.ArrayList;

//4. Create arraylist of 10 integers. Insert an element at 7th position. 
public class Q4InsertElementAtPosition {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=10;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(7, 33);
		
		System.out.println(list);

	}

}
