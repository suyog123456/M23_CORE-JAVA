package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	@SuppressWarnings("unused")
	static final private float deliveryCharges=0.0f;
	//constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s]", isPrime);
	}

	public void bookProduct(float charges)
	{
		System.out.println("ACCOUNT NO: "+this.getAccNo()+" "+"ACCOUNT NAME: "+this.getAccNm()+" "
		+"CHARGES IS: "+this.getCharges());
	}

}