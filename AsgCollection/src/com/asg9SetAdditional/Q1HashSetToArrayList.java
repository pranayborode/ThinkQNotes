package com.asg9SetAdditional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//1.	WAP to convert a HashSet to a List/ArrayList.

public class Q1HashSetToArrayList {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
       
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        
        List<String> list = new ArrayList<>(hashSet);
        
        System.out.println("HashSet : "+hashSet);
        System.out.println("ArrayList: "+list);
        
	}

}
