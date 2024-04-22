package com.lab14;

//You bought roses for 3 Rs each. You sell them for Rs100 a dozen. 
//If you bought 600 roses, how many roses do you need to sell to recover the buying costs? 
//Write a method which takes roses bought as input and returns the number of roses 
//which need to be sold to recover the buying costs. [1M]


public class RoseCalculator {

	public static int calcRecoverBuyingCost(int totalRoses) {
		int costPerRose = 3;
		int costperDozen = 100;

		int buyingCost = totalRoses * costPerRose;

		int dosensToSell = buyingCost / costperDozen;

		int roseToSell = dosensToSell * 12;

		return roseToSell;

	}

	public static void main(String[] args) {

		int totalRoses = 600;

		int rosesToSell = calcRecoverBuyingCost(totalRoses);

		System.out.println("To recover the buying cost " + rosesToSell + " Roses, need to sell");

	}

}
