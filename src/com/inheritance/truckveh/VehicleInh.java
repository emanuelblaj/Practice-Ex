package com.inheritance.truckveh;

// Build a subclass of Vehicle for trucks.

public class VehicleInh {
	private int passengers; // number of passengers.
	private int fuelcap; // fuel capacity in gallons
	private int mpg; // fuel consumprion in miles per gallon
	
//	This is a constructor for VehicleInh.
	VehicleInh(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
//	 Return the range.
	int range() {
		return mpg * fuelcap;
	}
	
//	 Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
	
//	 Accesor methods for instance variables.
	int getPassengers() {
		return passengers;
	}
	void setPassengers(int p) {
		passengers = p;
	}
	
	int getFuelCap() {
		return fuelcap;
	}
	void setFuelCap(int f) {
		fuelcap = f;
	}
	int getMpg() {
		return mpg;
	}
	void setMpg(int m) {
		mpg = m;
	}
}
