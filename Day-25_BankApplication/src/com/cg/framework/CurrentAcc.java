package com.cg.framework;


public abstract class CurrentAcc extends BankAcc 
{
	final private float creditLimit;
	@SuppressWarnings("unused")
	static final private float MINBAL = 0.0f;


	//Parameterized Constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	public void withdraw(float withdraw)
	{
		System.out.println("Account No: "+this.getAccNo()+" Account Name: "+this.getAccNm()+" Account Balance is: "+(this.getAccBal()- withdraw));
	}
	
	

}