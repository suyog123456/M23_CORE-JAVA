package com.cg.interfacedemo;
//multiple inheritance using interface
interface Father {
	void property();
}
interface Mother {
	void love();
}
class Daughter implements Father,Mother {
	@Override
	public void love() {
		System.out.println("MOTHER LOVES THEIR CHILD");
	}
	@Override
	public void property() {
		System.out.println("FATHER GIVES PROPERTY TO CHILD");
	}
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.love();
		d.property();

	}

}