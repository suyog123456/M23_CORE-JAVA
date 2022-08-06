package com.cg.scanbuff;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String str=s.nextLine();
		
		System.out.println("ENTER NUMBER");
		int a=s.nextInt();
		System.out.println(str);
		System.out.println(a);
		s.close();

	}

}
