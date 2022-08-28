package com.cg.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.*;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//if we need to inherit an annotation from superclass then go with inherited annotation
@Inherited
//custom annotation
@interface CustomB
{
	//abstract method
	//Multi-value annotation
	String print() ;
	
}

class Z
{
	@CustomB(print = "suyog")

	public void display()
	{
		System.out.println("SUPER CLASS");
	}
}
class D extends Z
{
	public void display1()
	{
		System.out.println("SUB CLASS");
	}
}
public class InheritedAnnotation {

	public static void main(String[] args) throws Exception
	{
		D obj=new D();
		obj.display();
		obj.display();
		
		Method m=obj.getClass().getMethod("display");
		CustomB obj1=m.getAnnotation(CustomB.class);
		
		System.out.println(obj1.print());
		

	}

}