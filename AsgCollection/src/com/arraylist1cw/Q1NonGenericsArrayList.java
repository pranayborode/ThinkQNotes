package com.arraylist1cw;

import java.util.ArrayList;
import java.util.List;

//1.WAP to add elements to arraylist without using generics (no <>) and 
//  print content of it where Integer is used. In second arraylist String is used.
public class Q1NonGenericsArrayList {

	public static void main(String[] args) {
	
		List l1 = new ArrayList();
		
		l1.add(14);
		l1.add(34);
		l1.add(55);
		l1.add(14);
		
		System.out.println(l1);
		
		
		List l2 = new ArrayList();
		
		l2.add("Dog");
		l2.add("Cat");
		l2.add("Tiger");
		l2.add("Fish");
		
		for(int i = 0 ; i<l2.size(); i++) {
			
			System.out.println(l2.get(i));
		}
	}

}
