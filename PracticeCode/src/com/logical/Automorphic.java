package com.logical;

import java.util.Scanner;

public class Automorphic {
	
	static boolean checkAutomorphic(int num) {
		
		long square = (long)num*num;
		
		while(num>0) {
			
			if(num%10 != square%10) {
				return false;
			}
			num /=10;
			square /= 10; 
			
		}
		return true;
	}

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a Number");
	        int n = sc.nextInt();

	        if (checkAutomorphic(n)) {
	            System.out.println("Automorphic");
	        } else {
	            System.out.println("Not Automorphic");
	        }

	        sc.close();

	}

}
