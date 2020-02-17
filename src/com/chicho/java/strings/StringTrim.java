package com.chicho.java.strings;

import com.sun.xml.internal.ws.util.StringUtils;

public class StringTrim {

	public static void main(String[] args) {
		String name = "     Sandip 						        Chicholikar    XYZ";
		//various split method -- split(" "), split("\\s+"), split("\\s+",2);
		String[] nameList = name.trim().split("\\s+",2);
		System.out.println(nameList.length);
		System.out.println("First Name: "+nameList[0]);
		System.out.println("Last Name: "+nameList[1]);
		
		String name2 = "   ";
		System.out.println("TrimmedValue"+name2.trim());
	}

}
