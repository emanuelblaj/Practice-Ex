package com.trafficlightdemonstration;

/*
 * A simulation of a traffic light that uses
 * an enumeration to describe the light's color.
 */
public enum TrafficLightColor {
	RED(12000), GREEN(10000), YELLOW(2000);
	
	private int delay;
	
	private TrafficLightColor(int d) {
		delay = d;
	}
	
	int getDelay() {
		return delay;
	}
}
