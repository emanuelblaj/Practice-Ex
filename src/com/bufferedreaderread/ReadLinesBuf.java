package com.bufferedreaderread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Read a string from console using a BufferedReader.

public class ReadLinesBuf {

	public static void main(String[] args) throws IOException {
//		Create a BufferedReader using System.in.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");
		System.out.println();
		
		do {
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals("stop"));
		System.out.println("You choose 'stop'.");
	}

}
