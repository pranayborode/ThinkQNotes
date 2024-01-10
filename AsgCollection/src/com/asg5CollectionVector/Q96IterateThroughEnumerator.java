package com.asg5CollectionVector;

import java.util.Enumeration;
import java.util.Vector;

//6. Iterate through vector using enumerator

public class Q96IterateThroughEnumerator {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("Car");
		vector.add("Bike");
		vector.add("Aeroplane");
		vector.add("Bote");
		
		Enumeration<String> e = vector.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
