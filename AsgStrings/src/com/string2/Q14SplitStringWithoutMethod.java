package com.string2;

//14. Split the string w/o method
public class Q14SplitStringWithoutMethod {

	public static void splitString(String str) {

		int newIndex=1;
		char sp = ' ';
		
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == sp) {
				newIndex++;
			}
		}
		
		String newStrArray[] = new String[newIndex];
		int startIndex = 0;
		
		for(int i = 0; i<newStrArray.length; i++) {
			
			for(int j = startIndex; j<str.length(); j++) {
				
				if(str.charAt(j)==sp) {
					
					newStrArray[i]= str.substring(startIndex, j);
					startIndex = j+1;
					break;
					
				}
				if (j == str.length() - 1) {
                    newStrArray[i] = str.substring(startIndex);
                }
			}
			System.out.println(newStrArray[i]);
		}

	}

	public static void main(String[] args) {

		String str = "Java is a programing language";

		splitString(str);

	}

}
