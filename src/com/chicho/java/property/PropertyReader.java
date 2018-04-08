package com.chicho.java.property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader(
					"C:\\Users\\Master\\git\\All-Java-Programs\\src\\com\\chicho\\java\\property\\db.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties p = new Properties();

		try {
			p.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}

	/*
	 * Note: Now if you change the value of the properties file, you don't need
	 * to compile the java class again. That means no maintenance problem.
	 */
}
