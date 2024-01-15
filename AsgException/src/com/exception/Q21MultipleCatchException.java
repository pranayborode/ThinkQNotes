package com.exception;

//21. WAP to catch multiple exceptions. 
//I.e. ArrayIndexOutOfBoundsException and ArithmeticException and NullPointerException. 
public class Q21MultipleCatchException {

	public static void main(String[] args) {
		try {
           
            int[] array = new int[3];
            int value = array[5];

           
            int result = 10 / 0;

          
            String str = null;
            int length = str.length(); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " );
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " );
        } catch (NullPointerException e)  {
            System.out.println("Caught NullPointerException: "  );
        } catch (Exception e) {
            
            System.out.println("Caught Exception: " );
        }
    }

}
