package com.overridingmethod;

// A subclass of TwoDShapeOver for rectangles.

public class RectangleOver extends TwoDShapeOver{
	
//	A default constructor.
	public RectangleOver() {
		super();
	}
	
//	Constructor for RectangleOver.
	RectangleOver(double w, double h) {
		super(w, h, "rectangle"); //call superclass constructor.
 	}
	
//	Construct a square.
	RectangleOver(double x) {
		super(x, "rectangle"); // call superclass constructor.
	}
	
//	Construct an object from an object.
	RectangleOver( RectangleOver ob) {
		super(ob); //pass object to TwoDShapeOver constructor.
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight())
			return true;
		return false;
	}
	
//	override area() for Rectangle.
	double area() {
		return getWidth() * getHeight();	}
	
}
