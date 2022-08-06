package com.cg.decisionmaking;

public class Nested_if_else {

	public static void main(String[] args) {
      int age=16,weight=84;
      if(age>=14)
      {
    	  if(weight<=115)
    	  {
    		  System.out.println("Eligible for bunjee jumping");
    	  }
    	  else {
    		 
    		 System.out.println("Extra ropes will be added"); 
    	  }
      }
      else
      {
    	  System.out.println("Not eligible for bunjee jumping");
      }
	}
	

}
