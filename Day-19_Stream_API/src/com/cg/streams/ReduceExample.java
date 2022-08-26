package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		
		List<Integer>obj=Arrays.asList(45,151,46,69,5,18);
		Optional<Integer>result=obj.stream().reduce((i,j)->i>j?i:j);
		if(result.isPresent())
		{
			System.out.print("RESULT IS: "+result.get());
		}

	}

}