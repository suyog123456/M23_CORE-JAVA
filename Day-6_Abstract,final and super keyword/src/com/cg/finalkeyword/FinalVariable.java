package com.cg.finalkeyword;
//Program on final variable
public class FinalVariable {

	final int Fin_var=45;
	/* public void print() {
	  //if any variable is declare as a final we cannot change the value of that 
	   fin_var=76;
	   }*/
	public static void main(String[] args) {
		
		FinalVariable f=new FinalVariable();
		System.out.println(f.Fin_var);
	}

}