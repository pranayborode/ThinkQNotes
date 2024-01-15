package com.collectionmethods;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListLinkList {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		LinkedList a2 = new LinkedList();
		
		System.out.println(a1 instanceof Serializable); //true	
		System.out.println(a2 instanceof Serializable); //true
		
		System.out.println(a1 instanceof Cloneable); //true
		System.out.println(a2 instanceof Cloneable); //true
		
		System.out.println(a1 instanceof RandomAccess); //true
		System.out.println(a2 instanceof RandomAccess); //false
		
		
		ArrayList l = new ArrayList();
		
		List l1 = Collections.synchronizedList(l);

	}

}
