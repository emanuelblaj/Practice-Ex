package com.swingprogr;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

// Demonstrate a push button and handle action events.

public class ButtonDemo implements ActionListener{

	JLabel jlab;
	
	public ButtonDemo() {
//		Create a new JFrame container.
		JFrame jfrm  = new JFrame("A Button Example.");
		
//		Specify FlowLayout for the layout manager.
		jfrm.setLayout(new FlowLayout());
		
//		Give the frame an initial size.
		jfrm.setSize(220, 90);
		
//		Terminate the program when the user closes the application,
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Make two buttons.
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
//		Add action listeners.
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
//		Add the buttons to the content pane.
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		
//		Create a label.
		jlab = new JLabel("Press a button.");
		
//		Add the label to the frame.
		jfrm.add(jlab);
		
//		Display the frame.
		jfrm.setVisible(true);
		
	}
	
//	Handle button events.
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up.");
		else
			jlab.setText("You pressed down.");
	}
	public static void main(String[] args) {
//		Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ButtonDemo();
				
			}
		});

	}

}
