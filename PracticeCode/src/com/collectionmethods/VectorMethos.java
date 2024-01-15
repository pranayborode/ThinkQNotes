package com.collectionmethods;

import java.util.Vector;

public class VectorMethos {

	public static void main(String[] args) {
		
		Vector v = new Vector(10, 5);
		
		v.add("Pranay");
		v.add("Sahil");
		v.add("Pranay");
		v.add("Sahil");
		v.add("Pranay");
		v.add("Sahil");
		v.add("Pranay");
		v.add("Sahil");
		v.add("Pranay");
		v.add("Sahil");
		v.add("Pranay");
		v.add("Sahil");
		
		
//		v.remove("Pranay");
//		v.removeElementAt(0);

		int i =v.capacity();
		System.out.println(i);
		System.out.println(v);

	}

}
