package com.cg.lambdaexp;
// to implement the runnable interface method
public class RunnableInterfaceImplementationUsingLambda {

	public static void main(String[] args) {
		/*//Runnable interface
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("RUNNABLE INTERFACE IMPLEMENTATION");
				
			}
		};*/
		Runnable r1=()-> {
			System.out.println("RUNNABLE INTERFACE IMPLEMENTATION");
		};
		
		Thread t=new Thread(r1);
		t.start(); /*when we call start it will come into run method asdiscussed in lifecycle of thread*/

	}

}