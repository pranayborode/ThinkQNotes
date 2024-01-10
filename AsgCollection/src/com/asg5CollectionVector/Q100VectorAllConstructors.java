package com.asg5CollectionVector;

import java.util.Vector;

//100. Create vector using all its constructors.
public class Q100VectorAllConstructors {

	public static void main(String[] args) {

		Vector<String> vector1 = new Vector<>();

		vector1.add("Car");
		vector1.add("Bike");
		
		System.out.println("Vector2 : "+vector1);
		
		Vector<String> vector2 = new Vector<>(3);

		vector2.add("Car");
		vector2.add("Bike");
		vector2.add("Aeroplane");
		vector2.add("Bote");
		
		System.out.println("Vector2 : "+vector2);
		

		Vector<String> vector3 = new Vector<>(3, 2);
		
		vector3.add("Car");
		vector3.add("Bike");
		vector3.add("Aeroplane");
		vector3.add("Bote");
		
		System.out.println("Vector3 : "+vector3);

	}

}
