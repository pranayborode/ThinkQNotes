package com.ifelse;

import java.util.Scanner;

public class ShopingDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of quantity");
		int quantity = sc.nextInt();
		
		if(quantity > 1000) {
			
			int cost = quantity*100;
			
			double disc = (cost * 10)/100;
			
			double totalCost = cost - disc;
			System.out.println("Total cost of items is  "+totalCost);
		}else {
			System.out.println("need to buy "+(1000 - quantity)+" more quantity for 10% discount");
		}
		sc.close();

	}

}
