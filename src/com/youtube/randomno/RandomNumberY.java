package com.youtube.randomno;

/*
 * Write an app that generates a random integer in the range of 20
 * to 40 inclusive, and displays the sine, cosine, tangent of that number
 */
import java.util.Random;

public class RandomNumberY {

	public static void main(String[] args) {
		double number;
		Random random = new Random();
		
		number = random.nextInt(21) + 20;
		
		System.out.println("The number is: " + number);
		System.out.println("Sin = " + Math.sin(number));
		System.out.println("Cos = " + Math.cos(number));
		System.out.println("Tan = " + Math.tan(number));
	}

}
