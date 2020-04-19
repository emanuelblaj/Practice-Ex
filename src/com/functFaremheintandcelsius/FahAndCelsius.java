package com.functFaremheintandcelsius;

public class FahAndCelsius {
	
/**
 * Converts from Fahrenheit to Celsius degrees.
 *
 * @param tempFah Temperature in degrees Fahrenheit.
 * @return Equivalent temperature in degrees Celsius.
 */
	public double fahreinheitToCelsius(double tempFah) {
		
		return (tempFah - 32) * 5 / 9;
	}
	/**
	 * Prints a temperature in both Fahreinheit and Celsius degrees.
	 * @param fahDegree Temperature in degrees Fahrenheit
	 */
	
	public void printTemperature(double fahDegree) {
		System.out.println("F: " + fahDegree);
		System.out.println(" C: " + fahreinheitToCelsius(fahDegree));
	}

}
