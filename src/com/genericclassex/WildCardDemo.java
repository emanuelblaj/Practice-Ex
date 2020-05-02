package com.genericclassex;

// Demonstrate a wildcard.

public class WildCardDemo {

	public static void main(String[] args) {
		NumericFnsWildCard<Integer> iOb = new NumericFnsWildCard<Integer>(6);
		NumericFnsWildCard<Double> dOb = new NumericFnsWildCard<Double>(-6.0);
		NumericFnsWildCard<Long> lOb = new NumericFnsWildCard<Long>(5L);
		
		System.out.println("Testing iOb and dOb.");
		if(iOb.absEqual(dOb))
			System.out.println("Absolute values are equal.");
		else
			System.out.println("Absolute values differ.");
		
		System.out.println();
		
		System.out.println("Testing iOb and lOb.");
		if(iOb.absEqual(lOb))
			System.out.println("Absolute values are equal.");
		else 
			System.out.println("Absolute values differ.");

	}

}
