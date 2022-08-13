package com.cg.string;

public class StringBufferSetCharAtExample {
	

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("JAVA");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1,'a');
		System.out.println(sb);
		System.out.println(sb.charAt(1));

	}

}