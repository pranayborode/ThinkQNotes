package com.filehandling1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {

	public void writeFile(File f)
	{
		try {
			
			if(!f.exists())
			{
				f.createNewFile();
			}
			
			FileWriter fw= new FileWriter(f);
			fw.write("Welcome to thinkQ \n");
			fw.write("Languages: Java,.net");
			
			System.out.println("Data added");
			fw.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void readFile(File f)
	{
		try {
			if(f.exists())
			{
			  FileReader fr= new FileReader(f);
			  int i=0;
			  while((i=fr.read())!=-1)
			  {
				  System.out.print((char)i);
			  }
			  
			  fr.close();
			}
			else
			{
				System.out.println("No such file exists...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

	public static void main(String[] args) {
		FileReaderWriter obj= new FileReaderWriter();
		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\chario.txt");
		
		obj.writeFile(f1);
		obj.readFile(f1);
		
	}
}
