package com.helpusesdiskfile;

// Demonstrate the file-based HelpFileInfo system.

public class FileHelp {

	public static void main(String[] args) {
		HelpFileInfo hlpobj = new HelpFileInfo("filex//helpfile.txt");
		String topic;
		
		System.out.println("Try the help system. " + "Enter 'stop' to end.");
		do {
			topic = hlpobj.getSelection();
			
			if(!hlpobj.helpOn(topic))
				System.out.println("Topic not found.\n");
		} while(topic.compareTo("stop") != 0);
	}

}
