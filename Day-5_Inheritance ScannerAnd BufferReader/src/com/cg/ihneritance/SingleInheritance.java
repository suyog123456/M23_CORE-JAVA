package com.cg.ihneritance;
class Parent{
	protected int roll_no;
	void print()
	{
		System.out.println("Hey Guys whats going on");
	}
}
class Child extends Parent{
    void accept() {
	System.out.println("THE ROLL NO IS:"+roll_no);
}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.roll_no=121;
		c.print();
		c.accept();

	}

}
