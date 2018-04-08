package com.chicho.java.collections;

import java.util.LinkedList;
import java.util.List;

class Book1 {
	int id;
	String name, author, publisher;
	int quantity;

	public Book1(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedListAddObject {

	public static void main(String[] args) {
		// Creating list of Books
		List<Book1> list = new LinkedList<Book1>();
		// Creating Books
		Book1 b1 = new Book1(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book1 b2 = new Book1(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book1 b3 = new Book1(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (Book1 b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}
