package com.assignment5;


// 22.Write the program in Java to display the first ten terms of the following series:
//    1, 2, 4, 7, 11,
public class Q22PrintSeries {

	
	public static void main(String[] args) {
		
		int n = 1;
		for(int i = 0; i<=10; i++) {
			
		    n =i+ n;                    // (0+1 =1) , (1+1=2), (2+2=4), (3+4=7)
			System.out.print(n+" ");
			
			
			
		}
	}
	
	
	
}
