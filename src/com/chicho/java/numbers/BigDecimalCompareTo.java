package com.chicho.java.numbers;

import java.math.BigDecimal;

public class BigDecimalCompareTo {

	public static void main(String[] args) {
		BigDecimal bigDecimal = new BigDecimal(12.3D); //12.3D, 0D, -12.3D
		if(bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
			System.out.println("Greater than Zero");
		} else if(bigDecimal.compareTo(BigDecimal.ZERO) == 0){
			System.out.println("Equal to Zero");
		}else if(bigDecimal.compareTo(BigDecimal.ZERO) < 0){
			System.out.println("Less than Zero");
		}

	}

}
