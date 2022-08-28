package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatchesMethod {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String pattern="CORE#JAVA";
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();
	
	}

}