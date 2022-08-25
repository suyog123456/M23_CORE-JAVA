package com.cg.lambdaexp;

public class MaxFinderTest {

	public static void main(String[] args) {
		MaxFinder obj=(a,b)->a>b?a:b;
		System.out.println("THE GREATEST VALUE IS :"+obj.maximum(22,50));

	}

}