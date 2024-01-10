package com.asg5CollectionArraylist;

//17. What is difference between array and arraylist.

/*Arrays and ArrayLists are both used to store elements in Java, but they have some key differences:

Type of Elements:

Array: An array in Java can store elements of the same data type. Once you declare the type of elements 
       an array will hold, you cannot change it.

ArrayList: An ArrayList can store elements of different data types. 
           It is part of the Java Collections Framework and can dynamically resize itself.
           
**************************************************************************************************************           
Size:

Array: Arrays in Java have a fixed size, which means you need to declare the size 
       when you create an array, and it cannot be changed afterward.
ArrayList: ArrayLists can dynamically resize themselves. 
           You can add or remove elements from an ArrayList without specifying its size. 
           The size of an ArrayList is dynamic and can grow or shrink as needed.
           
                      
**************************************************************************************************************
           
Mutability:

Array: Once an array is created, its size and elements cannot be changed.
ArrayList: ArrayLists are mutable. You can add, remove, or modify elements at any point.

           
**************************************************************************************************************
Performance:

Array: Arrays generally have better performance when it comes to direct element access. 
       They use contiguous memory locations, making access faster.
ArrayList: ArrayLists have some overhead due to their dynamic resizing and additional methods. 
           In scenarios where frequent modifications to the size of the collection are required, 
           an ArrayList might be more convenient despite a slight performance overhead.

           
**************************************************************************************************************
Usage of Generics:

Array: Arrays can use generics, but the syntax is different. For example, Integer[] intArray is an array of integers.
ArrayList: ArrayLists use generics in a straightforward manner, allowing you to 
           specify the type of elements they will contain, like ArrayList<Integer>.

           
**************************************************************************************************************
API and Methods:

Array: Arrays have a limited set of methods provided by the Java language, and their functionality is quite basic.
ArrayList: ArrayLists provide a rich set of methods and operations, including dynamic resizing, sorting, searching, 
           and more, thanks to the Java Collections Framework.


In summary, arrays are a basic and fixed-size data structure, while ArrayLists provide more flexibility, dynamic resizing, and a richer set of methods for handling collections of objects. The choice between them depends on the specific requirements of your program.

*/
public class Q17DifferenceArrayArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
