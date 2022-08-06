package com.cg.ihneritance;
class AndroidVersion{
	void dislpay() {
		System.out.println("Android-Version");
	}
}
class Kitkat extends AndroidVersion{
	void print() {
		System.out.println("Kitkat");
	}
}
class Pie extends Kitkat{
	void print1() {
		System.out.println("Pie");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
       Kitkat k=new Kitkat();
       Pie p=new Pie();
       k.dislpay();
       k.print();
       p.print1();

	}

}
