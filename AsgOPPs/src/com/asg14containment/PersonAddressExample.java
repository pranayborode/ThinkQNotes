package com.asg14containment;

public class PersonAddressExample {

	public static void main(String[] args) {
		
		Address address = new Address("Amravati", "Maharashtra", "India");
		
		Person person = new Person("Pranay", "Male", 29, address);
		
		System.out.println(person);

	}

}
