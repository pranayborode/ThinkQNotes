package com.asg5CollectionVector;

import java.util.Vector;

//Create a vector of 5 string objects. Add 5 strings to it.
public class Q94StringVector {

	public static void main(String[] args) {
		
		Vector<String> list = new Vector<>();
		
		list.addElement("One");
		list.addElement("Two");
		list.addElement("Three");
		list.addElement("Four");
		list.addElement("Five");
		
		System.out.println(list);

	}

}
