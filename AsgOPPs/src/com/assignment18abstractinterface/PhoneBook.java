package com.assignment18abstractinterface;

abstract class Book {
	
	public String name;
	public String contact;
	
	
	public Book(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}
	
	abstract void display();
	
	
}


//1)You have to build a phone book. The phone book has the name and contact of a person. 
//This is an openly accessible book so it should be designed accordingly.
//Public


public class PhoneBook extends Book {

	public PhoneBook(String name, String contact) {
		super(name, contact);
		
	}
	
	@Override
	void display() {
		System.out.println("Name: "+name+" - ContactNo: "+contact);
		
	}


	public static void main(String[] args) {
		
		PhoneBook p1 = new PhoneBook("Pranya", "8989898998");
		PhoneBook p2 = new PhoneBook("Ram", "7890909090");
		
		p1.display();
		p2.display();

	}

	
}
