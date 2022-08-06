package com.cg.ihneritance;
class Bike{
	protected int speed;
	void display() {
		System.out.println("I like to drive Bike");
	}
}
class Pulser extends Bike{
	protected String colour;
	void print() {
		System.out.println("Speed is:"+speed);
	}
}
class Pulser125 extends Pulser{
	void accept(){
		System.out.println("Colour is:"+colour);
	}
}
public class MultiLevelInhehitance {

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.colour="Black";
		p.speed=150;
		p.print();
		p.accept();

	}

}
