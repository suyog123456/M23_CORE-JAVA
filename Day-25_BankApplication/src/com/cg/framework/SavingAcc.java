package com.cg.framework;

public abstract class SavingAcc extends BankAcc
{
	
	private boolean isSalaried;
	@SuppressWarnings("unused")
	static final private float MINBAL = 2000.0f;
	
	//Parameterized Constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	public void withdraw(float withdraw)
	{
		System.out.println("Account No: "+this.getAccNo()+" Account Name: "+this.getAccNm()+" Account Balance is: "+(this.getAccBal()-withdraw-50));
	}
		
}