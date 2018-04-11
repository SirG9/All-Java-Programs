package com.chicho.springs.dependencyinjection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DependencyLookup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* we get the resource(instance of A class) directly by new keyword */
		A obj1 = new AImpl();

		/*
		 * we get the resource (instance of A class) by calling the static
		 * factory method getA()
		 */
		A Obj2 = A.getA();

		Context ctx;
		try {
			ctx = new InitialContext();

			Context environmentCtx = (Context) ctx.lookup("java:comp/env");
			A obj3 = (A) environmentCtx.lookup("A");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}