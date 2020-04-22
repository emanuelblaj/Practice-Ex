package com.exceptionshandling;

// Use a custom exception

// Create an exception.

public class NonIntResultException extends Exception {
	int n;
	int d;
	
	public NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}
	@Override
	public String toString() {
		
		return "Result of " + n + " / " + d + 
				" is non-integer.";
	}
}
