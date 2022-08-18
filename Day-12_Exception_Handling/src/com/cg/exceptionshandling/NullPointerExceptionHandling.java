package com.cg.exceptionshandling;

public class NullPointerExceptionHandling {

	public static void main(String[] args) {
          
		
		String str=null;
		try
		{
			str.equals("JAVA");
			
		}
		catch(Exception e)
		{
		   str=new String("JAVA");
		   System.out.println(str.equals("JAVA"));
		}

	}

}
