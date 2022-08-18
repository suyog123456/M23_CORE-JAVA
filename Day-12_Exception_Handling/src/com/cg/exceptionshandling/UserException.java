package com.cg.exceptionshandling;


class CustomException extends Exception
{   
    private int detail;
	//parameterized constructor
    public CustomException(int deatil) {
    	super();
    	this.detail = detail;
  }
    
    public CustomException(String message) {
    	super(message);
    }
    
    @Override
    public String toString() {
    	return "CustomException [dtail=" + detail + "]";
    }
}

public class UserException {
	private static String e;

	static void accept(int a)throws CustomException
	{
		System.out.println("Called compute");
		if(a>10)
			throw new CustomException(e);
		System.out.println("No Exception");
	}

	public static void main(String[] args) {
		try
		{
			accept(11);
		}
		catch(CustomException e)
		{
			System.out.println("SUYOG"+e);
		}
		
	}

}
