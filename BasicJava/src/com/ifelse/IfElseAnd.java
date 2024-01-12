package com.ifelse;

import java.util.Scanner;

public class IfElseAnd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of items");
		int noOfItems = sc.nextInt();
		
		System.out.println("Enter cost per item");
		double costPerItem = sc.nextDouble();
		
		double total = noOfItems * costPerItem;
		
		if((noOfItems > 10) && (total > 2000 )) {
			System.out.println("Toatal Bill : "+total);
			System.out.println("Discount offered : 10%");
			total = total -(0.1*total);
		}
		System.out.println("Anount to pay : "+total);
		sc.close();
	}

}
