package com.assignment19array1;

//27. WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, 
//{34, 42, 2}} output is: 34, 42, and 16.  
//28. WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, 
//{34, 42, 2}} output is: 12, 5, 2. 
public class Q27PrintMaxMinInCol {

	public static void printColWiseMax(int ar[][]) {

        for (int j = 0; j < ar[0].length; j++) {
            int maxInCol = findMaxInCol(ar, j);
            System.out.println("Max Element in Col " + (j + 1) + " : " + maxInCol);
        }
    }

    public static int findMaxInCol(int ar[][], int j) {

        int max = ar[0][j];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i][j] > max) {
                max = ar[i][j];
            }
        }
        return max;
    }

    ///////////////////////////////////////////////////////////////////////////////////

    public static void printMinInColu(int arr[][]) {

        for (int j = 0; j < arr[0].length; j++) {
            int minInCol = printMinInColumn(arr, j);
            System.out.println("Min Element in Col " + (j + 1) + " : " + minInCol);
        }
    }

    public static int printMinInColumn(int arr[][], int j) {

        int min = arr[0][j];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][j] < min) {
                min = arr[i][j];
            }
        }
        return min;
    }

    public static void main(String[] args) {
    	int arr[][] = { { 12, 31, 9 }, 
		                { 12, 5, 16 }, 
		                { 34, 42, 2 } };


        printColWiseMax(arr);
        System.out.println("==========================================");
        printMinInColu(arr);
    }
}