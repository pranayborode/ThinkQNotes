package com.arraylist1cw;

import java.util.ArrayList;
import java.util.List;

//2. WAP add elements to arraylist without using generics, 0th location keep Integer, 
//   1st location String now print each element and display contents.
public class Q2NonGenericsArrayList {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		list1.add("India");
		list1.add(1947);
		
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

}
