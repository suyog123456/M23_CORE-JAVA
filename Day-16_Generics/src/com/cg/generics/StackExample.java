package com.cg.generics;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		obj.add(0,"SUYOG");
		obj.add(0, 'M');
		obj.add(0, 12.52);
		System.out.println(obj);

	}

}