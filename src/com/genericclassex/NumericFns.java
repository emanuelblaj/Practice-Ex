package com.genericclassex;

/*
 * In this version of NumericFns, the type argument for T must be either Number,
 * or a class derived from number.
 */
public class NumericFns<T extends Number> {
	T num;
	
//	Pass the constructor a reference to a numeric object.
	public NumericFns(T n) {
		num = n;
	}
	
//	Return the reciprocal.
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
//	Return the fractional component.
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}
