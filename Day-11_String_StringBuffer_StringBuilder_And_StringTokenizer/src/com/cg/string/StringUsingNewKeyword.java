package com.cg.string;
//program on string using new keyword
import java.util.Scanner;

public class StringUsingNewKeyword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String str1=new String(s.nextLine());  //new keyword
		System.out.println(str1);
		s.close();
	}

}