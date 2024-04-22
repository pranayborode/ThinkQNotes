package com.lab11;

public class PersonExample {

	public static void main(String[] args) {
		
		Address a1 = new Address(101, "Amravati", 444705);
		Address a2 = new Address(102, "Pune", 411052);
		
		Person p1 = new Person("Pranay", 25, "pranay@gmail.com", a1);
		
		Person p2 = new Person("Anup", 27, "anup@gmail.com", a2);
		
		System.out.println(p1);
		System.out.println("-----------------------------------------------");
		System.out.println(p2);

	}

}
