package com.guardia.testgit.operations;

public class Divide {
	public Divide() {
		
	}
	public int divide (int a,int b ) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("Divide by 0");
		} else {
			return a/b;
		}
	}
}
