package com.jimscott.week5coding;

//3.	Create two classes that implement the Logger interface
//a.	AsteriskLogger
//b.	SpacedLogger

public class SpacedLogger implements Logger {
	
//	6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
	
	@Override
	public void log(String str) {
		
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i) + " ");
		}
		
		System.out.println(log);
		
	}
	
//	8.	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	
	@Override
	public void error(String str) {
		System.out.print("ERROR: ");
		log(str);
	}

}
