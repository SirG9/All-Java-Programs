package com.chicho.java.strings;

public class LineBreakPlatformIndependent {

	public static void main(String[] args) {
		String line1 = "Twinkle twinkle little star";
		String line2 = "How I wonder what you are?";
		String rhyme = line1 + System.lineSeparator() + line2;
		System.out.println(rhyme);
		
		//Another method
		rhyme = line1 + System.getProperty("line.separator") + line2;
		System.out.println(rhyme);
	}

}
