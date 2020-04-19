package com.helpprogram;

import java.io.IOException;

// A simple help system
public class Help {
	public static void main(String[] args) throws IOException{
		char choice, ignore;
		HelpClasssDemo help = new HelpClasssDemo();
		for(;;)  {
			do {
				help.showMenu();
				
				choice = (char) System.in.read();
				do {
					ignore = (char)  System.in.read();
				} while(ignore != '\n');
			} while(!help.isValid(choice));
			if(choice == 'q') {
				break;}
		System.out.println("\n");
		help.helpOn(choice);
		}
		
	}
}
