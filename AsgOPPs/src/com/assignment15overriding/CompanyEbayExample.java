package com.assignment15overriding;

//2) WAP to create class company with method address. create class eBay 
//which extends company implement address() differently in eBay class.
//Here the method address ()has been overridden in child class.

class Company{
	public void address(){
		System.out.println("Company address mehtod");
	}
}

class Ebay extends Company{

	public void address(){
		System.out.println("Ebay address overridden mehtod");
	}
	
}

public class CompanyEbayExample {

	public static void main(String[] args) {
		
		Ebay ebay = new Ebay();
		
		ebay.address();

	}

}
