package com.asg5CollectionArraylist;

import java.util.ArrayList;

//38. Create arraylist using all constructors of arraylist class
public class Q38ArrayListAllConstructors {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList<>(6);
		
		list2.add("D");
		list2.add("E");
		list2.add("F");
		
		System.out.println(list2);
		
		ArrayList<String> list3 = new ArrayList<>(list2);
		
		System.out.println(list3);
		
		
 
	}

}
