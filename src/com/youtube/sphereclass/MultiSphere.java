package com.youtube.sphereclass;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiSphere {

	public static void main(String[] args) {
		double r = 0;
		DecimalFormat fmt = new DecimalFormat();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a diameter of a sphere: ");
		r = scan.nextDouble();
		scan.close();
		
		Sphere sphere = new Sphere(r);
		
		System.out.println(fmt.format(sphere.getVolume()));
		System.out.println(fmt.format(sphere.getArea()));
		

	}

}
