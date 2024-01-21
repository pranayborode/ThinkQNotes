package com.filehandling1;


import java.io.File;


public class DeleteFile {


	public void deleteFile(File f) {
		
		try {
		
		if(f.exists()) {
			
			if(f.delete()) {
			
				System.out.println(f.getName()+" is deleted");
				
			}else {
				System.out.println("Error..");
			}
		}else {
			System.out.println("File not found...");
		}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		DeleteFile obj = new DeleteFile();
		
		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\fileiocopy.txt");
		
		obj.deleteFile(f1);
		
	}

}
