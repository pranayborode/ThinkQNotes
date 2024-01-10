package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.ListIterator;

//18. Traverse arraylist in reverse direction using list iterator.
public class Q18ReverseArrayListTraversal  {

	public static void main(String[] args) {
		
		 ArrayList<String> stringList = new ArrayList<>();

	       
	        stringList.add("One");
	        stringList.add("Two");
	        stringList.add("Three");
	        stringList.add("Four");
	        
	        ListIterator<String> listIterator = stringList.listIterator(stringList.size());

	        while(listIterator.hasPrevious()) {
	        	System.out.println(listIterator.previous());
	        }
	}

}
