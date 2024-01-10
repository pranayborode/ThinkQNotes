package com.asg6CollectionMasterAssignment;

import java.util.Iterator;
import java.util.TreeSet;

//3. What will be output of following program

public class MapTest {

	public static void main(String[] args) {
		
		TreeSet<String> map = new TreeSet();
		
		map.add("C");
		map.add("Java");
		map.add("Collection");
		map.add("AngularJs");
		map.add("JQuery");
		
		Iterator<String> itr = map.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	} // Justify
}
