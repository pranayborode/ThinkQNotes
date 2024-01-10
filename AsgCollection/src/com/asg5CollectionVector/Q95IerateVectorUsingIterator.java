package com.asg5CollectionVector;

import java.util.Iterator;
import java.util.Vector;

//95. Iterate through vector using iterator.

public class Q95IerateVectorUsingIterator {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		
		vector.add("Car");
		vector.add("Bike");
		vector.add("Aeroplane");
		vector.add("Bote");
		
		Iterator<String> iterator = vector.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
