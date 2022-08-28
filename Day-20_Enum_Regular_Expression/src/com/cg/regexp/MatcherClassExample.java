package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) {
		
		Scanner s=new  Scanner(System.in);
		Pattern p=Pattern.compile("AND");
		//Matcher m=p.matcher("JAVA IS GENERAL PURPOSE PROGRAMMING LANGUAGE AND EASY TO USE");
		
		//using user input
		System.out.println("ENTER THE STRING :");
		Matcher m=p.matcher(s.nextLine());
		//it will check "AND" location until last and it will print
		while(m.find()) {
			System.out.println("PATTERN FOUND FROM "+m.start()+" TO "+(m.end()-1));
		}
		s.close();

	}

}