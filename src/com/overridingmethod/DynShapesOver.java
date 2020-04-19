package com.overridingmethod;

public class DynShapesOver {
	public static void main(String[] args) {
		TwoDShapeOver shapes[] = new TwoDShapeOver[5];
		shapes[0] = new TriangleOver("outlined", 8.0, 12.0);
		shapes[1] = new RectangleOver(10);
		shapes[2] = new RectangleOver(10, 4);
		shapes[3] = new TriangleOver(7.0);
		shapes[4] = new TwoDShapeOver(10, 20, "generic");
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
		
	}

}
