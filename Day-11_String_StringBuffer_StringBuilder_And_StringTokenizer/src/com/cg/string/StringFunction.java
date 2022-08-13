package com.cg.string;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING 1");
		String str1=s.nextLine();
		System.out.println("ENTER STRING 2");
		String str2=s.nextLine();
		System.out.println(str1.length());                   //length
		System.out.println(str1.charAt(3));                  //char at
		System.out.println(str1.toLowerCase());              //lower case letter
		System.out.println(10+20+"HELLO"+"WORLD"+20+30);     //concatenation
		System.out.println(str1.concat(str2));
		s.close();
	}

}