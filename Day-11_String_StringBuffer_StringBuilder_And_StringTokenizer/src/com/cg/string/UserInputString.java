package com.cg.string;

import java.util.Scanner;

//program on user input string
public class UserInputString {

	public static void main(String[] args) {
		//String str="SANDESH";
		//System.out.println(str);
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String str1=s.nextLine();
		System.out.println(str1);
		s.close();
	}

}