package com.assignment21TwodArrays;

// 11. WAP to find the average of the inner most elements of an array.
public class Q11AverageOfInnermostElements {

	public static double averageOfInnermostElements(int ar[][]) {
		
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i<ar.length; i++) {
			
			for(int j = 0; j<ar[i].length; j++) {
				
				sum +=ar[i][j];
				count++;
			}
		}
		
		if(count != 0) {
			
		     return (double)sum/count;
		}else {
			return 0.0;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 00 01 02
		// 10 11 12
		// 20 21 22
		
		double average = averageOfInnermostElements(arr);
		System.out.println("Average of the inner most elements: "+average);

	}

}
