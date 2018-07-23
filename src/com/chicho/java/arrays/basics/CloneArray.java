package com.chicho.java.arrays.basics;

public class CloneArray {

	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3 };

		int cloneArray[] = intArray.clone();

		// will print false as deep copy is created
		// for one-dimensional array
		System.out.println(intArray == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}

		// Multi-dimensional Copy
		int intArrayM[][] = { { 1, 2, 3 }, { 4, 5 } };

		int cloneArrayM[][] = intArrayM.clone();

		// will print false
		System.out.println(intArrayM == cloneArrayM);

		// will print true as shallow copy is created
		// i.e. sub-arrays are shared
		System.out.println(intArrayM[0] == cloneArrayM[0]);
		System.out.println(intArrayM[1] == cloneArrayM[1]);
	}

}
