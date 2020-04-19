package com.returnobject;

// Return a programmer-defined object.
public class ErrClass {
	String msg; // error message
	int severity; //code indicating severity of error
	
	ErrClass(String m, int s) {
		msg = m;
		severity = s;
	}

}
