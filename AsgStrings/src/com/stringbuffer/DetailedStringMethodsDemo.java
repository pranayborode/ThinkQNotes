package com.stringbuffer;

import java.util.Arrays;

public class DetailedStringMethodsDemo {

	public void charAtDemo() {
		String str = "Good Morning";
		char chIndex = str.charAt(6);
		System.out.println("CharAtDemo: " + chIndex);

	}

	public void compareToObjectDemo() {
		String str1 = "apple";
		Object obj = "banana";
		int result = str1.compareTo(obj.toString());
		System.out.println("compareToObjectDemo: " + result);

	}

	public void compareToStringDemo() {
		String str1 = "apple";
		String str2 = "banana";
		int result = str1.compareTo(str2);
		System.out.println("compareToStringDemo: " + result);

	}

	public void compareToIgnoreCaseDemo() {
		String str1 = "apple";
		String str2 = "banana";
		int result = str1.compareToIgnoreCase(str2);
		System.out.println("compareToIgnoreCaseDemo: " + result);

	}

	public void concatDemo() {
		String str1 = "Good";
		String str2 = " Morning";
		String result = str1.concat(str2);
		System.out.println("concatDemo: " + result);
	}

	public void contentEqualsDemo() {
		String str1 = "India";
		StringBuilder str2 = new StringBuilder("India");
		boolean result = str1.contentEquals(str2);
		System.out.println("contentEqualsDemo" + result);
	}

	public void copyValueOfDemo() {
		char charArray[] = { 'H', 'e', 'l', 'l', 'o' };
		String result = String.copyValueOf(charArray);
		System.out.println("copyValueOfDemo: " + result);

	}

	public void equalsIgnoreCaseDemo() {
		String str1 = "Java";
		String str2 = "java";
		boolean result = str1.equalsIgnoreCase(str2);
		System.out.println("equalsIgnoreCaseDemo: " + result);

	}

	public void indexOfDemo() {
		String str = "Good Morning";
		int index = str.indexOf("n");
		System.out.println("indexOfDemo: " + index);

	}

	public void lastIndexOfDemo() {
		String str = "Good Morning";
		int index = str.lastIndexOf("o");
		System.out.println("lastIndexOfDemo: " + index);

	}

	public void lengthDemo() {
		String str = "Good Morning";
		int length = str.length();
		System.out.println("lengthDemo" + length);

	}

	public void matchesDemo() {
		String regex = "[A-Za-z]+";
		String str = "HelloWorld";
		boolean result = str.matches(regex);
		System.out.println("matchesDemo: " + result);
	}

	public void replaceDemo() {
		String str = "Good Morning";
		String result = str.replace("Morning", "Night");
		System.out.println("replaceDemo: " + result);
	}

	public void splitDemo() {
		String str = "Java is a programming language";
		String strArray[] = str.split("\\s");
		System.out.println("splitDemo: " + Arrays.toString(strArray));

	}

	public void substringDemo() {
		String str = "Java is a programming language";
		String result1 = str.substring(13);
		String result2 = str.substring(10, 17);
		System.out.println("substringDemo: " + result1);
		System.out.println("substringDemo: " + result2);

	}

	public void toStringDemo() {
		char chArray[] = { 'H', 'e', 'l', 'l', 'o' };
		String result = String.valueOf(chArray);
		System.out.println("toStringDemo: " + result);

	}

	public void toUpperCaseDemo() {
		String str = "india";
		String result = str.toUpperCase();
		System.out.println("toUpperCaseDemo: "+result);

	}

	public void toLowerCaseDemo() {
		String str = "INDIA"; 
		String result = str.toLowerCase();
		System.out.println("toLowerCaseDemo: "+result);

	}

	public void trimDemo() {
		String str = "   India    ";
		String result = str.trim();
		System.out.println("trimDemo: "+result);

	}

	public void valueOfDemo() {
        int num = 42;
        String result = String.valueOf(num);
        char ch = 'a';
        String result2 = String.valueOf(ch);
        System.out.println("valueOfDemo: "+result);
        System.out.println("valueOfDemo: "+result2);
		
	}

	public void hashCodeDemo() {
		String str = "India";
		int hashCode = str.hashCode();
		System.out.println("hashCodeDemo: "+hashCode);

	}

	public static void main(String[] args) {
		DetailedStringMethodsDemo s = new DetailedStringMethodsDemo();

		s.charAtDemo();
		s.compareToObjectDemo();
		s.compareToStringDemo();
		s.compareToIgnoreCaseDemo();
		s.concatDemo();
		s.contentEqualsDemo();
		s.copyValueOfDemo();
		s.equalsIgnoreCaseDemo();
		s.indexOfDemo();
		s.lastIndexOfDemo();
		s.lengthDemo();
		s.matchesDemo();
		s.replaceDemo();
		s.splitDemo();
		s.substringDemo();
		s.toStringDemo();
		s.toUpperCaseDemo();
		s.toLowerCaseDemo();
		s.trimDemo();
		s.valueOfDemo();
		s.hashCodeDemo();

	}

}
