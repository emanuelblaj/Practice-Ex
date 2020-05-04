package com.genericstack;

// An exception for stack-full errors.

public class StackFullException extends Exception {
	int size;
	
public StackFullException(int s) {
	size = s;
}

public String toString() {
	return "\nStack is full. Maximum size is "+ size;
	}
}
