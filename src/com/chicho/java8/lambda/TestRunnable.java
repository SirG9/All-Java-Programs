package com.chicho.java8.lambda;

public class TestRunnable {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("My Runnable");
			}
		};
		
		r.run();
		
		//Now Lambda Expression begins from here...
		
		Runnable r1 = () -> {
				System.out.println("My Runnable from r1");
		};
		
		r1.run();
	}

}
