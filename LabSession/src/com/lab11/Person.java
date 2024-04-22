package com.lab11;

public class Person {

	private String name;
	private int age;
	private String email;
	private Address address;

	public Person() {

	}

	public Person(String name, int age, String email, Address address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public String toString() {
		return "Person : Name - "+name+", Age - "+age+", Email - "+email+", \n"+address;
	}
}
