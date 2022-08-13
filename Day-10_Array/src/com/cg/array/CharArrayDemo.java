package com.cg.array;

public class CharArrayDemo {

	public static void main(String[] args) {
		char arr[]= {'a','b','1','?','A',' '};
		
		for (int i=0;i<arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				
				System.out.println(arr[i]+" IS A DIGIT");
			}
            if(Character.isLetter(arr[i])) {
				
				System.out.println(arr[i]+" IS A LETTER");
			}
            if(Character.isWhitespace(arr[i])) {
	
            	System.out.println(arr[i]+" IS A WHITESPACE");
            }
            if(Character.isUpperCase(arr[i])) {
				
				System.out.println(arr[i]+" IS A UPPERCASE");
			}
            if(Character.isLowerCase(arr[i])) {
				
				System.out.println(arr[i]+" IS A LOWERCASE");
			}

		}

	}

}