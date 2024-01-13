package com.assignment15overriding;


//1) WAP to create a class Kid with method readBook() and another method readBook () with 2
//parameters. The method readBook here is over-loaded (same method name but different
//parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
//BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()


class Kid{
	public void readbook() {
		System.out.println("Kid read book method1");
	}
	
	public void readbook(String bookName , String Author) { 
		System.out.println("kid read book method2 with two parameters");
	}
}



class BigKid extends Kid{
	public void readbook() {
		System.out.println("BigKid read book method");
	}
}

public class KidBigKidExample {

	public static void main(String[] args) {
		
		BigKid bk = new BigKid();
		
		bk.readbook();
		bk.readbook("The Cherry Tree", "Ruskin Bond");

	}

}
