package com.chicho.java.numbers;

public class RoundingDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13.036 should be 13.04
		double d = 13.036;
	    double dR = Math.round(d * 100D) / 100D;
		System.out.println(dR); //13.04
	}

}
