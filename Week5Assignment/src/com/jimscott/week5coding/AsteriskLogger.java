package com.jimscott.week5coding;

//3.	Create two classes that implement the Logger interface
//a.	AsteriskLogger
//b.	SpacedLogger

public class AsteriskLogger implements Logger {
	
//	4.	The log method on the AsteriskLogger should print out the String 
//	it receives between 3 asterisks on either side of the String (e.g. if 
//	the String passed in is “Hello”, then it should print ***Hello*** to the console.
	
	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
	}
	
//	5.	The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
//	with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, 
//	the following should be printed:
//
//		****************
//		***Error: Hello***
//		****************
	
	@Override
	public void error(String str) {
		
		String error = "ERROR: " + str;
		int length = error.length() + 6;
		StringBuilder line = new StringBuilder();
		
		for (int i = 1; i <= length; i++) {
			line.append('*');
		}
		
		System.out.println(line.toString());
		log(error);
		System.out.println(line.toString());
		
	}


}
