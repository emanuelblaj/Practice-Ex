package com.overridingmethod;

// Use dynamic method dispatch.

public class TwoDShapeOver {
	private double width;
	private double height;
	private String name;
	
//	 a default constructor
	public TwoDShapeOver() {
		width = height = 0.0;
		name = "none";
	}
	
//	Parameterized constructor.
	TwoDShapeOver(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
//	construct object with equal width and height.
	TwoDShapeOver(double x, String n) {
		width = height = x;
		name = n;
	}
	
//	Construct an object from an object.
	TwoDShapeOver(TwoDShapeOver ob){
		width = ob.width;
		 height =  ob.height;
		 name = ob.name;
	}
	
//	 Accessor methods for width and height.
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w ) {
		width = w;
		
	}
	void setHeight(double h) {
		height = h;
	}
	String getName() {
		return name;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	double area() {
		System.out.println("area() must be overridden");
		return 0.0;
	}
}
