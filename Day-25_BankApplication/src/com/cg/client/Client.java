package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		MMBankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(101,"SUYOG MERKHED",25000,true);
		CurrentAcc c=new MMCurrentAcc(102,"RAJ MERKHED",25000,2500);
		System.out.println("SAVING ACCOUNT : ");
		s.withdraw(12000);
		System.out.println("CUREENT ACCOUNT : ");
		c.withdraw(10000);
		
		System.out.println(s);
		System.out.println(c);
		
	}

}