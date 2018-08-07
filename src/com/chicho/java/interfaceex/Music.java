package com.chicho.java.interfaceex;

public class Music implements Instrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music piano = new Music();

		piano.play();
		piano.defaultPlay();
		Instrument.staticPlay();

		// Instrument.a = 20; //cannot be changed as it is final
		System.out.println(Instrument.a);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play Method definition from Music Class");
	}

}
