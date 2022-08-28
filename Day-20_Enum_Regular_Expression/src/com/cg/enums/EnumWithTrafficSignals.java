package com.cg.enums;
enum TrafficLight{
	RED(10),YELLOW(10),GREEN(30);

	private final int seconds;

	private TrafficLight(int seconds) {
		this.seconds=seconds;

	}

	public int  getSeconds() {
		
		return seconds;
	}
	
}
   

public class EnumWithTrafficSignals {

	public static void main(String[] args) {
		for(TrafficLight i :TrafficLight.values()) {
			System.out.printf("%s: %d seconds\n",i,i.getSeconds());
			
		}

	}

}