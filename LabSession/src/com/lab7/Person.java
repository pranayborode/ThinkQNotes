package com.lab7;

public class Person {

	public int age = 19;
	public String name;

	public static void main(String[] args) {

		Person p1 = new Person();

//		s1.age = 19;
		p1.name = "Pranay";

		System.out.println(p1.age);
		System.out.println(p1.name);

		Person p2 = new Person();

		p2.name = "Anup";
		System.out.println(p1.age);
		System.out.println(p2.name);

	}

}
