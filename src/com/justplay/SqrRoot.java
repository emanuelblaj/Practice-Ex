package com.justplay;

import java.io.IOException;

public class SqrRoot {
	public static void main(String[] args) throws IOException {
        /*double num, sroot, rerr;
        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " +  num + " is " + sroot);

            // compute rounding error
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
          }  
          
*/   
		char ch, ignore, answer = 'K';
		do {
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");
			
//			read  a character 
			ch = (char) System.in.read();
			
//		discard any other characters in the input buffer
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			if(ch == answer)
				System.out.println("** Right **");
			else {
				System.out.print("..Sorry, you're ");
				if(ch < answer) {
					System.out.println("too low");
				} else {
					System.out.println("too high");
				}
				System.out.println("Try again!\n");
			}
		} while(answer != ch);
		}

}
