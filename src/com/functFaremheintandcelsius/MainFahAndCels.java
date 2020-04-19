package com.functFaremheintandcelsius;

import java.util.Scanner;

public class MainFahAndCels {
	public static void main(String[] args) {
		FahAndCelsius fahandCels = new FahAndCelsius();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert fahTemp : ");
		double fahDegree = sc.nextDouble();
		fahandCels.printTemperature(fahDegree);
		
		sc.close();
	}

}
