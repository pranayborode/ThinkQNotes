package com.serializabledemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectInputOutput {
	
	static Scanner sc = new Scanner(System.in);
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void writeFile(File f) {

		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));
			
			User u[] = new User[3];
			
			for(int i= 0; i<3; i++) {
				
				u[i] = new User();
				
				System.out.println("Enter user id:");
				u[i].setUid(sc.nextInt());
				
				System.out.println("Enter name:");
				u[i].setName(br.readLine());
				
				System.out.println("Enter Password");
				u[i].setPassword(sc.next());
				
				oout.writeObject(u[i]);
				System.out.println("-----------------------------------------");
				
			}
			System.out.println("=========================================");
			
			oout.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void readFile(File f) {

		try {
			if (f.exists()) {

			ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));
			
			for(int i=0; i<3; i++) {
				
				User u = (User) oin.readObject();
				System.out.println(u);
				
				System.out.println("------------------------------------");
			}
			oin.close();
				
			} else {
				System.out.println("No such File exists...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		ObjectInputOutput obj = new ObjectInputOutput();

		File f1 = new File("D:\\Eclipse\\ThinkQuotient\\FileHandling\\objectio.txt");
		
		obj.writeFile(f1);
		obj.readFile(f1);

	}

}
