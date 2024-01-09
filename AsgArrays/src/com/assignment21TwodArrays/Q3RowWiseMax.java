package com.assignment21TwodArrays;


//3.	WAP to print maximum in rowwise in 2D array. 
//Means e.g. arr[][] = 	{{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.


public class Q3RowWiseMax {
	
	public static void printRowwiseMax(int arr[][]) {
		
		
		for(int i= 0; i<arr.length; i++) {
			
			int maxRow = findMax(arr[i]);
			
			System.out.println("Max Element in Row "+(i+1)+" : "+maxRow);
		}
		
	}
	
	public static int findMax(int row[])
	{
	
		int max = row[0];
		for(int j = 0; j<row.length; j++) {
			
			if(row[j]>max) {
				max = row[j];
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		
		int arr[][] = 	{{22, 31, 9}, {12, 25, 16}};
		
		printRowwiseMax(arr);

	}

}
