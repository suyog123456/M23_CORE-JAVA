
package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		//stream can be created with static data
				Stream<String>obj=Stream.of("SUYOG","PRATIK","RAJ","VISHAL");
				//Terminal Operation-forEach()
				obj.forEach((i)->System.out.print(i+" "));
				System.out.println();
				
				//stream can be acquired from array or collection
				List<String>obj1=Arrays.asList(new String[] {"49","20","29","33"});
				obj=obj1.stream();
				obj.forEach(System.out::println);
				
	}
	
			
}