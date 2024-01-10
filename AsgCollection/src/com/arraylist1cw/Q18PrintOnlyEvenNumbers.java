package com.arraylist1cw;

import java.util.ArrayList;
import java.util.Iterator;

//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
public class Q18PrintOnlyEvenNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer>numList = new ArrayList<>();
		
		for(int i = 1; i<=50; i++) {
			
			numList.add(i);
		}

		Iterator<Integer> iterator = numList.iterator();
		
		while(iterator.hasNext()) {
			int num = iterator.next();
			
			if(num %2 ==0) {
				System.out.print(num +" ");
			}
		}
		
		
		
	}

}
