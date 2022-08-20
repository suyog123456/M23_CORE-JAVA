package com.cg.list;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		obj.add(0,"SUYOG");
		obj.add(0,'M');
		obj.add(0,120.25f);
		System.out.println(obj);
		obj.push(35);
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);

	}

}