package com.instmethtorefertoanyinstance;
/*
 * This class stores an int value and defines the instance method isFactor(), which returns true 
 * if its argument is a factor of the stored value.
 */
public class MyIntNum {
	private int v;
	
	public MyIntNum(int x) {
		v = x;
	}
	
	int getNum() {
		return v;
	}
	
//	Return true if n is a factor of v.
	boolean isFactor(int n) {
		return (v % n) == 0;
	}
}
