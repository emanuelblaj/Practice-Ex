package com.overridingmethod;

// A subclass of TwoDShapeOver
public class TriangleOver extends TwoDShapeOver {
	private String style;
	
//	A default constructor
	TriangleOver() {
		super();
		style = "none";
	}
	
//	Constructor for TriangleOver
	TriangleOver(String s, double w, double h) {
		super(w, h,"triangle");
		
		style = s;
	}
	
//	One argument constructor.
	TriangleOver(double x) {
		super(x, "triangle"); // call superclass constructor.
		
		style = "filled";
	}
	
	TriangleOver(TriangleOver ob) {
		super(ob); // pass object to TwoDShapeOver constructor.
		style = ob.style;
	}
	
//	Override area() for TriangleOver.
	double area() {
		return getWidth() * getHeight() / 2;
		
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
 
}
