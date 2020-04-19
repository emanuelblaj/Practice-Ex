package com.inheritance;

// A subclass of TwoDShape for triangles.
public class Triangle extends TwoDShape {
//	String style;
//	
//	double area() {
//		return width * height / 2;
//		
//	}
//	void showStyle() {
//		System.out.println("Triangle is " + style);
//	}
	
//	 OR
	
	private String style;
	
//	Constructor
	Triangle(String s, double w, double h) {
		setWidth(w);
		setHeight(h);
		
		style = s;
	}
	
	double are() { 
		return getWidth() * getHeight() /2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
