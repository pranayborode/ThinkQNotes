package com.assignment5;

import java.util.Scanner;

//19.	check no is automorphic or not
//      input n=25
//      output Automorphic
//      as 25*25=625



public class Q19AutomorphicNumber {

    public static boolean checkAutomorphic(int num) {
       long square =(long)num * num;           //625  

        while (num > 0) {                      //25,      ---2       0 >0 --false  ---> return true;
            if (num % 10 != square % 10) {     //5 != 5 , ---2 != 2 
                return false;                 
            }
            num /= 10;                         //  2   -- 0
            square /= 10;                      // 62   -- 6
        }
        return true;                         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if (checkAutomorphic(n)) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }

        sc.close();
    }
}
