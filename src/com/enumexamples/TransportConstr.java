package com.enumexamples;

public enum TransportConstr {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	private int speed; // typical speed of each transport
	
	
	TransportConstr(int s) {
		speed = s;
	}
	
	int getSpeed() {
		return speed;
	}
}
