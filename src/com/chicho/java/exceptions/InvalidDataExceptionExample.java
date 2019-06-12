package com.chicho.java.exceptions;

import com.sun.media.sound.InvalidDataException;

public class InvalidDataExceptionExample {

	public static void main(String[] args) {
		try {
			InvalidDataException ide    = new InvalidDataException();
			if ( true )
			  {
			      throw ide;
			  }
		} catch (InvalidDataException e) {
			System.out.println("In Catch");
		}
	}

}
