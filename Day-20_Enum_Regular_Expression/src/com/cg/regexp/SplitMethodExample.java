package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitMethodExample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE STRING");
		String str=s.nextLine();
		//"//d" belongs to digit
		String delimeter="/n";
		//string will split by digits
		Pattern p=Pattern.compile(delimeter, Pattern.CASE_INSENSITIVE);
		String res[]=p.split(str);
		for(String i:res) {
			System.out.print(i+" ");
		}
		s.close();

	}

}