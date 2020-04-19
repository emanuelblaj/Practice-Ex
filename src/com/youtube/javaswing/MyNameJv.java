package com.youtube.javaswing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Write an app that displays a frame containing two labels that
 * display your name, one for your first name and one for your last.
 */
public class MyNameJv {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My name");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label1 = new JLabel("Emanuel");
		JLabel label2 = new JLabel("Cristian, FGKRKAKDKVb,sds");
		
//		Panel inside the frame
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setPreferredSize(new Dimension(800, 600));
		panel.add(label1);
		panel.add(label2);
		
//		display everything in frame
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
