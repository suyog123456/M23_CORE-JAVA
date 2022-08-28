package com.cg.annotations;

class Car
{
	public void speed(int s)
	{
		System.out.println("SPEED IS  : "+s+"km/hr");
	}
}
class BMW extends Car
{
	//@Override annotations is giving the extra information about the method
	@Override
	public void speed(int str)
	{
		System.out.println("SPEED IS : "+str+"km/hr");
	}
}
public class OverideAnnotation 
{
	public static void main(String args[])
	{
		BMW b=new BMW();
		b.speed(80);
	}

}