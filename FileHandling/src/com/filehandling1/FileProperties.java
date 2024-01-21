package com.filehandling1;

import java.io.File;
import java.io.IOException;

public class FileProperties {

	public static void main(String[] args) {
		
		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\first.txt");
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(f1.exists()) {
			
			if(f1.isFile()) {
				
				System.out.println("Path: "+f1.getAbsolutePath());
				System.out.println("Length: "+f1.length());
				System.out.println("File Name: "+f1.getName());
				System.out.println("Write: "+f1.canWrite());
				
			}else if (f1.isDirectory()) {
				System.out.println("Its is a directory");
			}
		}
	}
	

}
