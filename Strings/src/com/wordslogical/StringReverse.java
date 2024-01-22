package com.wordslogical;

public class StringReverse {
	
	public static void reverseComplete(String st) {
		
		String revSt = "";
		
		for(int i = st.length()-1;i>=0; i-- ) {
			revSt = revSt + st.charAt(i);
		}
		System.out.println(revSt);
	}

	public static void reverseComplete2(String st) {
		
		char ch[] = st.toCharArray();
		for(int i = 0, j= ch.length-1;i<ch.length/2;i++,j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		
		System.out.println(ch);
	}
	public static void main(String[] args) {
		
		String str = "I love India";
		reverseComplete(str);
		reverseComplete2(str);

	}

}
