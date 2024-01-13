package com.asg13polymorphism;

//1. WAJP2 create a class Kid with method readBook() and another method readBook () with 2 parameters. 
//   The method readBook here is over-loaded (same method name but different parameters) 
//2. Create a class BigKid which extends Kid created above. Implement readBook() differently in BigKid class. 
//   Here the method readBook() has been over-ridden in the child class BigKid() 

//3. Create a class Teenager which extends Kid created above (#14). Implement readBook() differently in Teenager class. 
//   In main method, declare 2 variables k1, k2 of type Kid. Create objects of type BigKid and Teenager such that K1 
//   should reference object of class BigKid and K2 should reference object of class Teenager. 
//   Call their respective readBook() methods. The output is different from both the method calls even 
//   if the variable type is the same i.e. Kid. This is compile time polymorphism example. 
class Kid {

	public void readBook() {
		System.out.println("Kid is reading a book");
	}
	
	public void readBook(String book1, String book2) {
		System.out.println("Kids fev books are " + book1+" & "+book2);
	}

}

class BigKid extends Kid{
	
	public void readBook() {
		System.out.println("BigKid is reading Science Friction books");
	}
}


class Teenager extends Kid{
	
	 public void readBook() {
	        System.out.println("Teenager is reading a novel");
	    }
}

public class PolymorphismExample{
	public static void main(String[] args) {
		
		Kid k = new Kid();
		k.readBook(); //Kid is reading a book
		k.readBook("StoryBook", "PoetryBook"); //Kids fev books are StoryBook & PoetryBook
		
		BigKid b = new BigKid();
		b.readBook(); //BigKid is reading Science Friction books
		
		System.out.println("--------------");
		
		Kid k1 , k2;
		
		k1 = new BigKid();
		k2 = new Teenager();
		
		k1.readBook(); //BigKid is reading Science Friction books
		k2.readBook(); //Teenager is reading a novel
		
	}
	
}