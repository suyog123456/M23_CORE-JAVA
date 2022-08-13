package com.cg.string;
//program on string literal
public class StringLiteral1 {

	public static void main(String[] args) {
		//String str="HELLO";
	    //String str1="HELLO";
	    String str1=new String("HELLO");
	    String str2=new String("HELLO");
	    System.out.println(str1==str2);
	    System.out.println(str1.equals(str2));
	}
}