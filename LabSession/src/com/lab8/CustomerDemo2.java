package com.lab8;

import java.util.Scanner;

public class CustomerDemo2 {

	
	public static void insertCustomer(Customer c) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id");
		c.setCid(sc.nextInt());
		
		System.out.println("Enter Customer Name");
		c.setCname(sc.next());
		
		System.out.println("Enter Customer Mail");
		c.setCmail(sc.next());
		
		System.out.println("Enter Customer Number");
		c.setCcontact(sc.nextLong());
		
		System.out.println("Enter Customer Password");
		c.setCpass(sc.next());
		
		
		
		sc.close();
	}
	
// NO need to write ----	
//	public void displayCustomer(Customer c) {
//		
//		System.out.println("Customer Id     : "+c.getCid());
//		System.out.println("Customer Name   : "+c.getCname());
//		System.out.println("Customer Mail   : "+c.getCmail());
//		System.out.println("Customer NUmber : "+c.getCcontact());
//		System.out.println("Customer Pass   : "+c.getCpass());
//	}
	
	public static void main(String[] args) {
	
		Customer c  = new Customer();
		
		insertCustomer(c);
		
		System.out.println(c);
		
	    
		
		
	}

}
