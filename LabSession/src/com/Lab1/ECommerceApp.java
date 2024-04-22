package com.Lab1;

import java.util.Scanner;

public class ECommerceApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Flipkart !!!");
		System.out.println("1.Men");
		System.out.println("2.Women");
		System.out.println("3.Kids");
		System.out.println("Please Enter Your Choice");
		int cat = sc.nextInt(); 
		int opt;

		
		if(cat == 1) {
			System.out.println("Thank's For Selecting Men's Category");
			
			System.out.println("Following are Sub-Category");
			System.out.println("1.Footwear");
			System.out.println("2.Tshirt");
			
			System.out.println("Please Enter Your Choice");
		    opt = sc.nextInt();
			
			if(opt == 1) {
				System.out.println("Selected Category : Men's ");
				System.out.println("Selected OPtion : Footwear");
			}else {
				System.out.println("Selected Category : Men's");
				System.out.println("Selected OPtion : Tshirt");
			}
			
		}else if (cat == 2) {
			System.out.println("Thank's For Selecting Women's Category");
			
			System.out.println("Following are Sub-Category");
			System.out.println("1.Jwellery");
			System.out.println("2.Saree");
			
			System.out.println("Please Enter Your Choice");
		    opt = sc.nextInt();
			
			if(opt == 1) {
				System.out.println("Selected Category : Women's");
				System.out.println("Selected OPtion : Jwellery");
			}else {
				System.out.println("Selected Category : Women's");
				System.out.println("Selected OPtion : Saree");
			}
		}else {
            System.out.println("Thank's For Selecting Kids Category");
			
			System.out.println("Following are Sub-Category");
			System.out.println("1.Toys");
			System.out.println("2.Educational Game");
			
			System.out.println("Please Enter Your Choice");
			opt = sc.nextInt();
			
			if(opt == 1) {
				System.out.println("Selected Category : Kids");
				System.out.println("Selected OPtion : Toys");
			}else {
				System.out.println("Selected Category : Kids");
				System.out.println("Selected OPtion : Educational Game");
			}
		}
		sc.close();
	}

}
