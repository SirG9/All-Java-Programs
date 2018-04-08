package com.chicho.java.property;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetProperties {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("name", "Master Sandeep");
		p.setProperty("email", "MasterSandeep@gmail.com");

		try {
			p.store(new FileWriter("info.properties"), "Master Properties Example");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
