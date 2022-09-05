package com.cg.framework;

public abstract class ShopFactory
{
	
	public abstract PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges);
	


}