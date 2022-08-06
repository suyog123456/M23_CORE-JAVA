package com.cg.looping;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.print(i);
			s.close();
		}
	}

}
