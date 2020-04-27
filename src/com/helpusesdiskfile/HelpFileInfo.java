package com.helpusesdiskfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A help program that uses a disk file to store help information.
 * 
 * The HelpFileInfo class opens a help file, searches for a topic,
 * and then displays the information associated with that topic.
 * Notice that it handles all I/O exceptions itself, avoiding
 * the need for calling code to do so.
 */

public class HelpFileInfo {
	String helpfile; // name of help file
	
	public HelpFileInfo( String fname) {
		helpfile  = fname;
	}
	
//	Display help on a topic.
	boolean helpOn(String what) {
		int ch;
		String topic, info;
		
//		Open the help file.
		try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile)))
		{
			do {
//				read characters until a# is found
				ch = helpRdr.read();
				
//				Now, see if topics match
				if(ch == '#') {
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0) { // found topic
						do {
							info = helpRdr.readLine();
							if(info != null)
								System.out.println(info);
						} while ((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			} while(ch != -1);
		}
		catch(IOException exc) {
			System.out.println("Error accessing helpt file.");
			return false;
			
		}
		return false; // topic not found
	}
	
//	Get a Help topic.
	String getSelection() {
		String topic = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter topic: ");
		try {
			topic = br.readLine();
		}
		catch(IOException exc) {
			System.out.println("Error reading console.");
		}
		return topic;
	}
}
