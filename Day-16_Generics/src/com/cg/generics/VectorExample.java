package com.cg.generics;

import java.util.Vector;

public class VectorExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();
		v.add(11);
		v.add("SUYOG");
		System.out.println(v);

	}

}