package com.inputoutputstream;
/*
 * Copy a text file.
 * To use this program, specify the name of the source file
 * and the destination file. For example, to copy a file called First.Txt to a file 
 * called Second.txt, use the following command line.
 * 
 * java CopyFile First.txt Second.txt
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null ;
		FileOutputStream fout = null ;
		
//		First, make sure that both files has been specified.
		if(args.length != 2) {
			System.out.println("Usage: CopyFile from to " );
			return;
		}
		
//		Copy a File.
		try {
//			Attempt to open the files.
			fin = new FileInputStream("Practice-Ex\\filex\\First.txt");
			fout = new FileOutputStream("Practice-Ex\\filex\\Second.txt");
			
			do {
				i = fin.read();
				if(i != -1)
					fout.write(i);
			} while(i != -1);
		} 
		catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		} finally {
			try {
				if(fin != null) 
					fin.close();
			} 
			catch(IOException exc ) {
				System.out.println("Error Closing Input File");
			}
			try {
				if(fout != null)
					fout.close();
			} 
			catch (IOException exc) {
				System.out.println("Error Closing Output File");
			}
		}

	}

}
