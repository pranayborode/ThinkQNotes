package com.assignment5;

import java.util.Scanner;

public class Q41QuantityMilkOil {

	public static void calcQuantity() {
		Scanner sc = new Scanner(System.in);
		
		 int milkPrice = 40;
	        int oilPrice = 50;

	        int totalCost = 0;
	        int totalLiters = 0;

	        while (totalCost <= 500) {
	            System.out.print("Enter the quantity of milk in liters: ");
	            int milkQty = sc.nextInt();

	            System.out.print("Enter the quantity of oil in liters: ");
	            int oilQty = sc.nextInt();

	            int milkCost = milkQty * milkPrice;
	            int oilCost = oilQty * oilPrice;

	            int purchaseCost = milkCost + oilCost;
	            totalCost += purchaseCost;
	            totalLiters += (milkQty + oilQty);

	            System.out.println("Total cost: " + totalCost);
	            System.out.println("Total liters: " + totalLiters);
	        }

	       
	        System.out.println("Milk: " + (totalLiters - 1) + " liters"); 
	        System.out.println("Oil: " + (totalLiters - 1) + " liters");

	        sc.close();
	}
	
	public static void main(String[] args) {
		

		calcQuantity();

	}

}
