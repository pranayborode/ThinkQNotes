package com.assignment5;


// 4.	23. Print Series 2 -4 6 -8………n terms

public class Q23PrintSeries {

	public static void main(String[] args) {
		
		   
		for(int i=1; i<=10; i++) {
			
			int n = 0;
			if(i % 2 ==0) {
				n=i*-2;
			}else {
				n=i*2;
			}
			
			System.out.print((n)+" ");
		}

	}

}
