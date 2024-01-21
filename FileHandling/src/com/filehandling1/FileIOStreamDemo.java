package com.filehandling1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamDemo {

	public void writeFile(File f) {
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			String data = "I Love India";
			FileOutputStream fout = new FileOutputStream(f);
			byte arr[] = data.getBytes();
			fout.write(arr);
			System.out.println("Data added");
			fout.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
 
	public void readFile(File f) {
		
		try {
			if(f.exists()) {
					
				
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(f));
				int i =0;
				while((i=bin.read())!=-1) {
					System.out.print((char)i);
				}
				bin.close();
			}
			else {
				System.out.println("No such File exists...");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		FileIOStreamDemo obj = new FileIOStreamDemo();
		
		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\first.txt");
		
		obj.writeFile(f1);
		
		obj.readFile(f1);
		
	}

}
