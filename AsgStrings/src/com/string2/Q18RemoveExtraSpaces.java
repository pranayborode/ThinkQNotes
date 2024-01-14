package com.string2;

//18.Removes all extra spaces in string
public class Q18RemoveExtraSpaces {

	public static void removeExtraSpace(String str) {
		
		char chArr[] = str.toCharArray();
		
		String strWithoutExtraSp = "";
		
		for(int i = 0; i<chArr.length; i++) {
			
			if(chArr[i]==' ') {
				
				if(!(strWithoutExtraSp.length()==0)) {
					
					if(i + 1 < chArr.length && chArr[i + 1] != ' ') {
						strWithoutExtraSp +=chArr[i];
					}
				}
			}else {
				strWithoutExtraSp += chArr[i]; 
			}
		}
		System.out.println(strWithoutExtraSp);
	}
	
	public static void main(String[] args) {
		
		String str = "  I   Love india   ";
		removeExtraSpace(str);
	}

}
