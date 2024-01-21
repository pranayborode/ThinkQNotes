package com.filehandling1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOStream {
	
public void writeFile(File f) {
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			
			DataOutputStream dout = new DataOutputStream(new FileOutputStream(f));
			dout.writeInt(0);
			dout.writeUTF("Gaurav");
			dout.writeFloat(78.50f);
			
			dout.close();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
 
	public void readFile(File f) {
		
		try {
			if(f.exists()) {
				
				DataInputStream din = new DataInputStream(new FileInputStream(f));
				
				System.out.println("RollNo: "+din.readInt());
				System.out.println("Name: "+din.readUTF());
				System.out.println("Marks: "+din.readFloat());
				
				din.close();
				
			}
			else {
				System.out.println("No such File exists...");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		
		DataIOStream obj = new DataIOStream();


		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\dataio.txt");
		
		obj.writeFile(f1);
		
		obj.readFile(f1);
	}

}
