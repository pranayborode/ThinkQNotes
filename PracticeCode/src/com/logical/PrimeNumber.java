package com.logical;

//Find all prime number between 400 to 300;

public class PrimeNumber {
	
	static boolean checkPrimeNum(int num) {
		
		if(num==0 || num ==1) {
			return false;
		}else {
			for(int i=2; i<num; i++) {
				
				if(num%2==0) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		for(int i=400; i>=300; i--) {
			if(checkPrimeNum(i)) {
				System.out.println(i);
			}
		}

	}

}
