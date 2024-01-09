package com.assignment19array1;

//25. WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 31 and 25.  

//26. WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 9 and 12. s
public class Q25PrintMaxMinInRow {

	public static void printRowWiseMax(int ar[][]) {
		
		for(int i = 0; i< ar.length; i++) {
		int maxInRow = findMaxInRow(ar[i]);
		System.out.println("Max Element in Row "+(i+1)+" : "+maxInRow);
		}
	}
	
	public static int findMaxInRow(int row[]) {
		
		int max = row[0];
		for(int j = 0; j< row.length; j++) {
			
			if(row[j]>max) {
				max = row[j];
				
			}
		}
		return max;
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	
	public static void printRowWiseMin(int ar[][]) {
		
		for(int i = 0; i< ar.length; i++) {
			
		int minInRow = findMinInRow(ar[i]);
			
			System.out.println("Min Element in Row "+(i+1)+" : "+minInRow);
		}
	}
	
	public static  int findMinInRow(int row[]) {
		
		int min = row[0];
		for(int j = 0; j< row.length; j++) {
			
			if(row[j]<min ) {
				min = row[j];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[][] = {{22, 31, 9}, {12, 25, 16}} ;

		printRowWiseMax(arr);
		System.out.println("==========================================");
		printRowWiseMin(arr);
	}

}
