package com.guardia.testgit.main;

import com.guardia.testgit.operations.Multiply;

import com.guardia.testgit.operation.Addition;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		displayMessage();
		Multiply mul = new Multiply();
		System.out.println(" 2*3 "+ mul.doMultiply(2, 3));
		Addition addition = new Addition(); 
		System.out.println(" 3+4 " + addition.doAdd(3,4));
	}
	
	private static void displayMessage() {
		System.out.println("Hello it works");

	}

}
