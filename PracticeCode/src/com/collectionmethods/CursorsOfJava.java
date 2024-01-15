package com.collectionmethods;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CursorsOfJava {

	public static void main(String[] args) {

		Vector v = new Vector();

		for (int i = 1; i <= 20; i++) {
			v.add(i);
		}

		System.out.println(v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			Integer i = (Integer) e.nextElement();
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		System.out.println("*****************************************************");
		

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			al.add(i);
		}

		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
	}

}
