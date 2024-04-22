package com.lab4;

import java.util.Scanner;

public class EnterUserNumber {

	public static void checkNumber() {
		Scanner sc = new Scanner(System.in);
		
		int pos = 0;
		int neg = 0;
		int zero = 0;
		char ch;
		int num;
 		do {
			System.out.println("Enter Number");
			num = sc.nextInt(); 
			
			if(num>0) {
				System.out.println("Positive Count");
				pos++;
			}else if (num<0) {
				System.out.println("Negative Count");
				neg++;
			}else {
				System.out.println("Zero Count");
				zero++;
			}
			System.out.println("Do you want to enter more Number");
			
		    ch = sc.next().charAt(0);
			
		}while(ch =='Y' || ch=='y');
 		
 		System.out.println("Positive : "+pos);
 		System.out.println("Negative : "+neg);
 		System.out.println("Zero : "+zero);
 		
	}
	public static void main(String[] args) {
		
		
	checkNumber();
	    
	    
		
	}

}
