package com.inheritance.truckveh;

// Extended Vehicle to create a Truck Specialization.

public class TruckInh extends VehicleInh {
	private int cargocap; // cargo capacity in pounds
	
//	This is a constructor for TruckInh.
	TruckInh(int p, int f, int m, int c){
//		Initialize VehicleInh members using Vehicle's constructor.
		super(p, f, m);
		
		cargocap = c;
	}

//	Accessor methods for cargocap.
	int getCargo() {
		return cargocap;
	}
	void putCargo(int c) {
		cargocap = c;
	}
}
