package com.enumexamples;

public class TransportDemo2 {

	public static void main(String[] args) {
		TransportConstr tp;
		
//		Display speed of an airplane.
		System.out.println("Typical speed for an airplane is " +
							TransportConstr.AIRPLANE.getSpeed() + 
							" miles per hour.\n");
		
//		Display all Transports and speeds.
		System.out.println("All Transport speeds: ");
		for(TransportConstr t :  TransportConstr.values())
			System.out.println(t + " typical speed is " + 
								t.getSpeed() + 
								" miles per hour.");

	}

}
