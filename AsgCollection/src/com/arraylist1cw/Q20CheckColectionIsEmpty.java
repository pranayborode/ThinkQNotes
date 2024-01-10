package com.arraylist1cw;

import java.util.ArrayList;

//20.	WAP to check if collection is empty
public class Q20CheckColectionIsEmpty {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		if(list.isEmpty()) {
			System.out.println("ArrayList is empty");
		}else {
			System.out.println("ArrayList is not empty");
		}

		list.add("Java");
		list.add("Python");
		
		if(list.isEmpty()) {
			System.out.println("ArrayList is empty");
		}else {
			System.out.println("ArrayList is not empty");
		}
		
	}

}
