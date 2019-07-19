package com.chicho.java.strings;

/**
 * @author csandip
 * CRLF - Carriage Return Line Feed
 * CR - &#13
 * LF - &#10
 */
public class LineBreakPlatformDependent {

	public static void main(String[] args) {
		String line1 = "Twinkle twinkle little star";
		String line2 = "How I wonder what you are?";
		String rhyme = line1 + "\n" + line2;
		String rhyme2 = line1 + "\r" + line2; //old Mac based OS
		String rhyme3 = line1 + "\r\n" + line2; //Windows-based OS
		System.out.println(rhyme);
		System.out.println(rhyme2);
		System.out.println(rhyme3);
	}

}
