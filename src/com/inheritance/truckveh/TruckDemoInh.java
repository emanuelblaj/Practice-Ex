package com.inheritance.truckveh;

public class TruckDemoInh {

	public static void main(String[] args) {
		
//		construct some trucks
		TruckInh semi = new TruckInh(2, 200, 7, 44000);
		TruckInh pickUp = new TruckInh(3, 28, 15, 2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		
		System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");
		
		gallons = pickUp.fuelneeded(dist);
		
		System.out.println("Pickup can carry " + pickUp.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");

	}

}
