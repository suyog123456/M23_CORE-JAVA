package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"SUYOG MERKHED",250, true);
		NormalAcc n=new GSNormalAcc(1002,"RAJ MERKHED",560, 50);
		System.out.println("PRIME ACCOUNT: ");
		p.bookProduct(100);
		
		System.out.println("NORMAL ACCOUNT: ");
		n.bookProduct(150);
		
		
		System.out.println(p);
		System.out.println(n);



		

	}

}