package com.guardia.testgit.main;

import com.guardia.testgit.operations.Multiply;
import com.guardia.testgit.operations.Power;
import com.guardia.testgit.operations.SquareRoot;
import com.guardia.testgit.operations.Substract;
import com.guardia.testgit.operations.Addition;
import com.guardia.testgit.operations.Divide;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		displayMessage();
		Addition addition = new Addition(); 
		Substract substract = new Substract();
		Multiply mul = new Multiply();
		Divide divide= new Divide();
		SquareRoot sqr = new SquareRoot();
		Power pow= new Power();
		System.out.println(" 3+4 = " + addition.doAdd(3,4));
		System.out.println(" 12-5 = " + substract.doSub(12, 5));
		System.out.println(" 2*3 = "+ mul.doMultiply(2, 3));
		System.out.println(" 6/3 = " + divide.divide(6, 3) );
		System.out.println(" Power (4,2) = "+pow.doPower(4, 2));
		System.out.println(" SquareRoot (2) = "+ sqr.doSquareRoot(2));
	}
	
	private static void displayMessage() {
		System.out.println("Hello it works");
	}

}
