package com.chicho.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating generic
															// arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
