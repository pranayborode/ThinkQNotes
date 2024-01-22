package com.stringbufferbuilder;

public class StringBufferBuilderDemo {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity()); // by default 16;

		StringBuffer sb2 = new StringBuffer(4);
		System.out.println(sb2.capacity()); //

		sb2.append("javas");// (currentCap*2)+2

		System.out.println(sb2 + " : " + sb2.capacity());

		System.out.println(sb2 + " : " + sb2.length());

	}
}
