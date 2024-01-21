package com.filehandling1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferReaderLogical {

	public void storeData(File f) {
		
		try {
			
			if(!f.exists()) {
				
				f.createNewFile();
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			FileWriter fw = new FileWriter(f, true);
			
			System.out.println("Enter data..Enter Stop to Finish");
			
			String data = "";
			while(true) {
				
				data = br.readLine();
				if(data.equalsIgnoreCase("stop"))
					break;
				fw.write(data);
				fw.write("\n");
			}
			
			System.out.println("---------------------------------------");
			br.close();
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public static void main(String[] args) {

		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\logicalid.txt");
		
		BufferReaderLogical obj = new BufferReaderLogical();
		
		obj.storeData(f1);

	}

}
