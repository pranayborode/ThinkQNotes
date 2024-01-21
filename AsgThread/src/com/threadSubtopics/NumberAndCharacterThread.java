package com.threadSubtopics;

//9.Thread t1 prints numbers 1 to 10 . Thread t2 prints characters a to h. 
//  Ensure that always characters are printed first and then numbers using join method.

class NumberPrinter extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
}

class CharacterPrinter extends Thread{
	
	@Override
	public void run() {
		
		for(char ch = 'a'; ch<='h'; ch++) {
			System.out.println(ch);
		}
	}
}
public class NumberAndCharacterThread {

	public static void main(String[] args) {
		
		Thread t1 = new NumberPrinter();
		Thread t2 = new CharacterPrinter();
		
		t1.start();
		t2.start();
		
		try {
			t2.join();
		}catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}
