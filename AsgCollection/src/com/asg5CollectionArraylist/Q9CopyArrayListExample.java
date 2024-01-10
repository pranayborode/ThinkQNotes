package com.asg5CollectionArraylist;

import java.util.ArrayList;
import java.util.Collections;

//9. Use copy method of collections class to make a copy of given 
//   arraylist of employees. Check if it creates shallow copy or deep 
//   copy. Check if department objects are also copied.
public class Q9CopyArrayListExample  {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		
		ArrayList<String> copyList = new ArrayList<>(list1.size());
		
		// Add elements to copyList to match the size of list1
        for (int i = 0; i < list1.size(); i++) {
            copyList.add(null); // Add null elements (or any initial value)
        }
		
		Collections.copy(copyList, list1);
		
		System.out.println("Original List: " + list1);
        System.out.println("Copied List: " + copyList);
        
        list1.add("Five");
        
        System.out.println("Original List: " + list1);
        System.out.println("Copied List: " + copyList);
        

	}

}
