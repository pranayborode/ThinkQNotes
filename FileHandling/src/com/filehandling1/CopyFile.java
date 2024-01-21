package com.filehandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public void copyContents(File f1, File f2) {
		
		try {
		
			f2.createNewFile();
			
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			
			int i= 0;
			
			while((i= fin.read())!= -1) {
				
				fout.write(i);
			}
			
			System.out.println("Filed Copy");
			
			fin.close();
			fout.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		CopyFile obj = new CopyFile();
		
		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\first.txt");

		File f2 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\firstcopy.txt");
		
        obj.copyContents(f1, f2);
	}

}
