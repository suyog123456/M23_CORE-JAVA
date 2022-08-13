package com.cg.string;

import java.util.Scanner;

public class StringLiteral2 {

	public static void main(String[] args) {
		String str="DHONI";
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String str1=s.nextLine();
		
		if(str1.equals(str)) {
			System.out.println("MATCHING");
		}
		else {
			System.out.println("NOT MATCHING");
		}
		s.close();

	}

}