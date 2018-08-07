package com.chicho.java.interfaceex;

public interface Instrument {
	
	int a=10; //This will be Static and Final be Default
	
	void play();
	
	default void defaultPlay(){
		System.out.println("Default Play Method");
	}
	
	static void staticPlay(){
		System.out.println("Static Play Method");
	}
}
