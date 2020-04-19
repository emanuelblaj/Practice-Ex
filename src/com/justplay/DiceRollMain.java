package com.justplay;

import java.util.Scanner;
import java.lang.Math;

public class DiceRollMain {
	public static void main(String[] args) {
		DiceRollMain dr = new DiceRollMain();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Insers no sides: ");
//		int sides = sc.nextInt();
		dr.diceRoll(7);
		dr.monopolyRoll();
//		sc.close();
	}
	
	/**
	*Returns a random integer sumulating a dice roll.
	*@param sides Number of sides on the virtual dice being rolled.
	* @return random number in the range of 1 to sides.
	 */

	 public int diceRoll(int sides) {
	    //  This expression generates a random double in the interval
	    // [0, sides]. That is, a double greater than or equal to
	    // 0 and less than sides.
	    double randomNumber = Math.random() * sides;
	    System.out.println("Random number is " + sides);

	    // Our random number is now in the interval [1, sides + 1]
	    randomNumber = randomNumber + 1;
	    // Casting the random number to an integer will round it down to an integer in the 1 to sides range.
	    return (int) randomNumber;
	 }

	 public int monopolyRoll() {
	     int roll1 = diceRoll(6);
	     int roll2 = diceRoll(6);
	     int total = roll1 + roll2;
	     if(roll1 == roll2) {
	         int roll3 = diceRoll(6);
	         int roll4 = diceRoll(6);
	         total = total + roll3 +  roll4;
	     }
	     return total;
	 }
}
