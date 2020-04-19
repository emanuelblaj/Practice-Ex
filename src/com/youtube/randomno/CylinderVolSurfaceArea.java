package com.youtube.randomno;

import java.util.Random;

/*
 * Write an app that generates a random integer radius(r) and height(h)
 * for a cylinder in the range 1 to 10, inclusive, and then computes the
 * volume and surface area of the cylinder.
 */
public class CylinderVolSurfaceArea {

	public static void main(String[] args) {
		int r ;
		int h;
		double vol;
		double area;
		Random random = new Random();
		
		r = random.nextInt(10) + 1;
		h = random.nextInt(10) + 1;
		
		vol = Math.PI * Math.pow(r, 2) * h;
		area = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
		System.out.println("r = " + r);
		System.out.println("h = " + h);
		System.out.println("vol = " + vol);
		System.out.println("area = " + area);
	}

}
