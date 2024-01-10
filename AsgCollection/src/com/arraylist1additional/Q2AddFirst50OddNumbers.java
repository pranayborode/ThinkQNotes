package com.arraylist1additional;

import java.util.ArrayList;

//2.	Create aarraylist of integers. Add first 50 odd numbers to arraylist.
public class Q2AddFirst50OddNumbers{

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<50; i++) {
			
			if(i%2 !=0) {
				list.add(i);
			}
		}
		
		for(Integer i: list) {
			System.out.println(i);
		}

	}

}
