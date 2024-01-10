package com.assignment2;

public class MyClass3 {

	public static void main(String[] args) {
		
		int a = 34;
        double d = 20.5;

        d+=a;  // d = d + a = 20.5 + 34 = 54.5
        a+=d;  // a = a + d = 34 + 54.5 = 88.5 a is int  ==> 88
        d-=a;  // d = d - a = 54.5 - 88 = -33.5
        a-=d;  // a = a - d = 88 - (-33.5) = 121.5 ==> 121
        
        // a = 121 
        // d = -33.5

        // ++d ==> -33.5 + 1 = -32.5
        // a-- ==> 121 
        // a = 120
        
        System.out.println(" d = " + ++d );     // -32.5                    
        System.out.println(" a = " + a-- );     // 121


	}

}
