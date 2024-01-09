package com.assignment20array2;

public class PrintArrayReverse {
	
    public static void printRev(int ar[]) {
    	
    	int size = ar.length;
    	for(int i=size-1; i>=0; i--) {
    		System.out.print(ar[i]+" ");
    	}
    }

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
 
		printRev(arr);
	}

}
