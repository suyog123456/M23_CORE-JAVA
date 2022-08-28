package com.cg.enums;

public enum Size implements PizzaSize {

	SMALL,MEDIUM,LARGE,EXTRALARGE;

	@Override
	public void size() {

		System.out.println("SIZE :"+this);
		
	}
}