package com.exception;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

//37. Modify the following cat method so that it will compile: 
//public static void cat(File named) {  
//RandomAccessFile input = null;  
//String line = null;  
//try {  
//input = new RandomAccessFile(named, "r");  
//while ((line = input.readLine()) != null) { 
//System.out.println(line);  
//}  
//return;  
//} finally {  
//if (input != null) {  
//input.close();  
//}  
//} 
//}
public class Q37ModifyMethod {

	public static void cat(File named) {

		RandomAccessFile input = null;
		String line = null;

		try {
			input = new RandomAccessFile(named, "r");

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (input != null) {
					input.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("example.txt");
		cat(file);

	}

}
