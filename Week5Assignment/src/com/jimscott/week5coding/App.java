package com.jimscott.week5coding;
//9.	Create a class named App that has a main method.
public class App {

	public static void main(String[] args) {

//	10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
//	11.	Test both methods on both instances, passing in Strings of your choice.
		
		asteriskLogger.log("A wild error has appeared!");
		asteriskLogger.error("Oops! I made an error");
		
		System.out.println();
		
		spacedLogger.log("Gimme some space!");
		spacedLogger.error("I CAN'T BELIEVE IT'S NOT AN ERROR!");

	}

}
