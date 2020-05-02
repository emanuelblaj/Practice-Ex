package com.staticimport;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

//Use static import to bring sqrt() and pow() into view.

public class Quadratic {

	public static void main(String[] args) {
//		a, b and c represent the coefficients in the quadratic equation
		double a, b, c, x;
		
		a = 4;
		b = 1;
		c = -3;
		
//		Find first solution.
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution: " + x);
		
//		Find second solution.
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second solution: " + x);

	}

}
