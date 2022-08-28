package com.cg.annotations;
import java.lang.reflect.Method;
import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface Custom
{
	//abstract method
	//Multi-value annotation
	String print() default "SUYOG";
	int speed() default 50;
	float percentage() default 2f;
	
}
class B
{
	@Custom (print="SUYOG",speed=80,percentage=3.6f)
	public void display()
	{
		System.out.println("DISPLAY METHOD");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) throws Exception {
		B b=new B();
		b.display();
		Method m=b.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());
		
	

	}

}