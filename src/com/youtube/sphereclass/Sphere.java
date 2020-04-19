package com.youtube.sphereclass;

import java.text.NumberFormat;

/*
 * Design and implement a class called Sphere that contains instance data that represents the sphere's diameter. Define the Sphere constructor to accept and initialize the diameter, and include getter and setter methods for the diameter.
Include methods that calculate and return the volume and surface area of the sphere. Create a driver class called MultiSphere, whose main method instantiates and updates several Sphere objects.  
Volume = (4/3) * Pi * r(to the power of 3)
Surface = 4 * Pi * r(to the power of 2)
 */
public class Sphere {
	
	private double _diameter;
	
	public Sphere(double diameter) {
		_diameter = diameter;
	}
	public double getDiameter() {
		return _diameter;
	}
	public void setDiameter(int diameter) {
		_diameter = diameter;
	}
	
	public double getVolume() {
		double v = 0;
		
		
		v = (4.00 / 3) * Math.PI * Math.pow(getDiameter(), 3);
		return v;
	}
	
	public double getArea() {
		double area = 0;
	
		area = 4 * Math.PI * Math.pow(getDiameter(), 2);
		return area;
	}
	
	public String toString() {
		NumberFormat fmt = NumberFormat.getNumberInstance();
		return fmt.format(getDiameter());
	}
}
