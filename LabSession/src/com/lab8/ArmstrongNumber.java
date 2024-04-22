package com.lab8;

import java.util.Scanner;

public class ArmstrongNumber {

	public static int countDigits(int n) {
		int count = 0;
		
		do {
			count++;
			n/=10;
			
		}while(n!=0);
		return count;
	}
	
	public static int calcPower(int b , int p) {
		int result = 1;
		
		for(int i=1; i<=p; i++) {
			result *=b;
		}
		return result;
	}
	
	public static void checkArmstrong(int n) {
		
		int originalNo = n;
		int sum = 0;
		int noOfDights = countDigits(n);
		while(n!=0) {
			int rem = n%10;
			 n /= 10;                                /////////
			sum = sum+calcPower(rem,noOfDights );
			
		};
		
		if(originalNo == sum) {
			System.out.println(originalNo +" is a Armstrong Number");
		}else {
			System.out.println(originalNo +" is Not a Armstrong Number");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");

		int num = sc.nextInt();
		
		checkArmstrong(num);
		
		sc.close();
	}

}
