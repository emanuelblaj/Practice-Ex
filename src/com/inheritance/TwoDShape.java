package com.inheritance;

// A simple class hierarchy.
// A class for two dimensional objects.

public class TwoDShape {
//	double width;
//	double height;
//	
//	void showDim() {
//		System.out.println("Width and height are " + width + " and "+ height);
//	}
	
//	OR
	
	private double width; // these are
	private double height; //now private
	
//	Accessor methods for width and height.
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		width = w;
	}
	void setHeight(double h) {
		height = h;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height );
	}
}
