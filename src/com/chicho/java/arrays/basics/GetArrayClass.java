package com.chicho.java.arrays.basics;

public class GetArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortsArray[] = new short[3];

		// array of Strings
		String[] strArray = new String[3];

		System.out.println(intArray.getClass());
		// Prints --> class [I
		// The string “[I” is the run-time type signature for the class object
		// “array with component type int“.

		System.out.println(intArray.getClass().getSuperclass());
		// class java.lang.Object
		// The only direct superclass of any array type is java.lang.Object.

		System.out.println(byteArray.getClass());
		// class [B
		// The string “[B” is the run-time type signature for the class object
		// “array with component type byte“.

		System.out.println(shortsArray.getClass());
		// class [S
		// The string “[S” is the run-time type signature for the class object
		// “array with component type short“.

		System.out.println(strArray.getClass());
		// class [Ljava.lang.String;
		// The string “[L” is the run-time type signature for the class object
		// “array with component type of a Class”. The Class name is then
		// followed.

	}

}
