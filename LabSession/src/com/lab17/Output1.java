package com.lab17;

import java.io.IOException;

public class Output1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("t1");
			try {
				System.out.println("t2");
				throw new Exception();
			}catch(IOException e) {
				System.out.println("c2");
			}finally {
				System.out.println("f2");
			}
			
			
		}catch (Exception e) {
			System.out.println("c1");
		}finally {
			 try {
				 System.out.println("t3");
				 try {
					 System.out.println("t4");
				 }catch (Exception e1) {
					System.out.println("c4");
				}finally {
					System.out.println("f4");
				}
			 }catch (Exception e1) {
				System.out.println("c3");
			}finally {
				System.out.println("f3");
			}
			 System.out.println("f1");
		}

	}

}
