package com.cg.framework;

public abstract class NormalAcc extends ShopAcc
{
	private final float deliveryCharges;
	
	//constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges);
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("ACCOUNT NO: "+this.getAccNo()+" "+"ACCOUNT NAME: "+this.getAccNm()+" "
		+"CHARGES IS: "+(charges+deliveryCharges));
	}

}