package com.cg.scanbuff;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str=b.readLine();
		System.out.println(str);
	}

}
