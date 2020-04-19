package com.youtube.javaswing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * Write an app that displatts a frame containing two panels.Each 
 * panel should contain two images(use 4 unique images of your
 * choice). Fix the size of the first panel so that both of its images
 * remain side by side.Allow the other panel to change size as needed.
 */

public class TwoPanels {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Two Panels and Images");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		image paths
		ImageIcon icon1 = new ImageIcon("./images/image1.jpg");
		ImageIcon icon2 = new ImageIcon("./images/image2.jfif");
		ImageIcon icon3 = new ImageIcon("./images/image3.jpg");
		ImageIcon icon4 = new ImageIcon("./images/image4.jfif");
		

//		labels
		JLabel label1, label2, label3, label4;
		label1 = new JLabel("Text Left", icon1, SwingConstants.CENTER);
		label2 = new JLabel("Text Right", icon2, SwingConstants.CENTER);
		label3 = new JLabel("Text Center Above", icon3, SwingConstants.CENTER);
		label4 = new JLabel("Text Center Down", icon4, SwingConstants.CENTER);

//		first panel
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(800, 600));
		panel1.setBackground(Color.red);
		panel1.add(label1);
		panel1.add(label2);
		label1.setHorizontalTextPosition(SwingConstants.LEFT);
		label2.setHorizontalTextPosition(SwingConstants.RIGHT);
		
//		second panel
		
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(800, 800));
		panel2.setBackground(Color.green);
		panel2.add(label3);
		panel2.add(label4);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.NORTH);
		label4.setHorizontalTextPosition(SwingConstants.CENTER);
		label4.setVerticalTextPosition(SwingConstants.BOTTOM);
		
//		main container
		JPanel primary = new JPanel();
		primary.setBackground(Color.blue);
		primary.add(panel1);
		primary.add(panel2);
		
//		put it all together
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
	}

}
