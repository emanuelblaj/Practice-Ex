package com.inheritance;

// Create a subclass by extending class AInhSup.

public class BInhSup extends AInhSup{
	int i; // this i hides the i in A
	
	BInhSup(int a, int b) {
		super.i = a; // i in AInhSup
		i = b; // i in BInhSup
	}
	
	void show() {
		System.out.println(" i in superclass: " + super.i);
		System.out.println(" i in subclass " + i);
	}
}
