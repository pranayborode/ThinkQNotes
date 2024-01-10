package com.arraylist1additional;

import java.util.*;

//18.	How to prove ArrayList increases its internal space, prove by showing Java code?
public class Q18ArrayListCapacity {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>(5);

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		System.out.println(arrayList);
		
		arrayList.add(60);
		
		System.out.println(arrayList);
	
		

	}

}
