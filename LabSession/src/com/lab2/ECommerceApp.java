package com.lab2;

import java.util.Scanner;

public class ECommerceApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select Your Category");
		System.out.println("1. Men");
		System.out.println("2. Women");
		System.out.println("3. Kids");
		
		int cat = sc.nextInt();
		int opt;
		switch(cat) {
		
		case 1:
			System.out.println("Enter Your Option");
			System.out.println("1. Footwere");
			System.out.println("2. Tshirt");
			 opt = sc.nextInt();
			switch(opt) {
			case 1: 
				System.out.println("Your Category is Men");
				System.out.println("Option choose by you is Footware");
				break;
			case 2: 
				System.out.println("Your Category is Men");
				System.out.println("Option choose by you is Footware");
				break;	
			default: System.out.println("Enter correct Option");	
			}
			break;
			
		case 2:
			System.out.println("Enter Your Option");
			System.out.println("1. Jewellery");
			System.out.println("2. Saree");
			opt = sc.nextInt();
			switch(opt) {
			case 1: 
				System.out.println("Your Category is Women");
				System.out.println("Option choose by you is Jewellery");
				break;
			case 2: 
				System.out.println("Your Category is Women");
				System.out.println("Option choose by you is Saree");
				break;	
			default: System.out.println("Enter correct Option");	
			}
			break;	
		case 3:
			System.out.println("Enter Your Option");
			System.out.println("1. Toys");
			System.out.println("2. Educational Game");
			opt = sc.nextInt();
			switch(opt) {
			case 1: 
				System.out.println("Your Category is Kids");
				System.out.println("Option choose by you is Toys");
				break;
			case 2: 
				System.out.println("Your Category is Kids");
				System.out.println("Option choose by you is Toys");
				break;
			default: System.out.println("Enter correct Option");	
			}
			break;	
			
			default: System.out.println("Enter correct Category");
		}

	}

}
