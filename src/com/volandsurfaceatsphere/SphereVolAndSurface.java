package com.volandsurfaceatsphere;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Write an app that reads the radius of a sphere andt
 * prints its volume and surface area.
 * Print the output to four decimal places.
 */
public class SphereVolAndSurface {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decForm = new DecimalFormat("0.####");
		double volume = 0;
		double area = 0;
		double radius = 0;
		
		System.out.println("Please enter the radius: " );
		radius = scanner.nextDouble();
		scanner.close();
		
		volume = (4.00 / 3) * Math.PI * Math.pow(radius, 3);
		area = 4 * Math.PI * Math.pow(radius, 2);
		
		System.out.println("Volume = " + decForm.format(volume));
		System.out.println("Area = " + decForm.format(area));

	}

}
