package com.lab17;

import java.util.Arrays;

// Write a program to sort array in such a way that largest element is in middle then 
// lower will be in left side of middle , next to right then next to left and so on.
// Assume that array size is always odd.

// e.g. input array - [3, 8, 4, 9, 10, 43, 7, 11, 30];
//      output array - [4 ,8, 10, 30, 43, 11, 9, 7, 3];
public class ShortArrayInMiddle {

	public static void sortArr(int arr[]) {
        int n = arr.length;
        int midIndex = n / 2;

        Arrays.sort(arr);

        int temp[] = new int[n];

        int left = midIndex - 1;
        int right = midIndex + 1;

        temp[midIndex] = arr[n - 1];

        for (int i = 0; i < n / 2; i++) {
            temp[left--] = arr[i];
            temp[right++] = arr[i + n / 2];
        }

      
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int arr[] = {3, 8, 4, 9, 10, 43, 7, 11, 30};
        System.out.println(Arrays.toString(arr));

        sortArr(arr);

        System.out.println(Arrays.toString(arr));
    }
}
