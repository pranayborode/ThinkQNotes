package com.logical;

import java.util.Scanner;

//Write a Java program to find frequency of each digit in a given integer.
public class FrequencyOfDigit {
	
	static void findFreqOfDigit(int num) {
		
		int count, digit, temp;
		
		for(int i=0; i<=9; i++) {
			
			count = 0; 
			temp = num;
			
			while(temp>0) {
				
				digit = temp%10;
				if(digit == i) {
					count++;
				}
				temp = temp/10;
			}
			if(count>0) {
				System.out.println(i+"-->"+count);
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		findFreqOfDigit(num);

	}

}
