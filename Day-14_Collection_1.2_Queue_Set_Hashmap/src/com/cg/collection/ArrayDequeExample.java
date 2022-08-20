package com.cg.collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayDeque a=new ArrayDeque<>();
		a.add(120);
		a.add("HELLO");
		System.out.println(a);
		a.addFirst(121);
		a.addLast("WORLD");
		System.out.println(a);

	}

}