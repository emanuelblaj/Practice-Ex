package com.bufferedreaderread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharsBuffe {

	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter characters, period to quit.");

//		read characters 
		do {
			c = (char) br.read();
			System.out.print(c);
			
		} while (c != '.');
	}

}
