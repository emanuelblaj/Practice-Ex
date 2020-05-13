package com.swingprogr;

// Demonstrate a simple JList.

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo implements ListSelectionListener {

	JList<String> jlist;
	JLabel jlab;
	JScrollPane jscrlp;
	
//	Create an array of names.
	String[] names = { "Sherry", "Jon", "Rachel", 
			"Sasha", "Josselyn", "Randy",
			"Tom", "Mary", "Ken", "Andrew", "Matt", "Tod"};
	
	public ListDemo() {
//		Create a  new JFrame container.
		JFrame jfrm = new JFrame("JList Demo");
		
//		Specify a flow Layout.
		jfrm.setLayout(new FlowLayout());
		
//		Give the frame an initial size.
		jfrm.setSize(200, 160);
		
//		Terminate the program when the use closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Create a JList.
		jlist = new JList<String>(names);
		
//		Set the list selection mode to single-selection.
//		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
//		Add list to a scroll pane.
		jscrlp = new JScrollPane(jlist);
		
		
//		Set the preffered size of the scroll pane.
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
//		Make a label that displays the selection.
		jlab = new JLabel("Please choose a name");
		
//		Add list selection handler.
		jlist.addListSelectionListener(this);
		
//		Add the list and label to the content pane.
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		
//		Display the frame.
		jfrm.setVisible(true);
		
		
	}
	
//	Handle list selection events.
	public void valueChanged(ListSelectionEvent le) {
//		Get the index of the changed item.
		int idx[] = jlist.getSelectedIndices();
		
//		Display selection, if one or more items were selected.
		if(idx.length != 0) {
			String who = "";
			
//			Construct a string of the names.
			for(int i : idx) 
				who += names[i] + " ";
			jlab.setText("Current selections: " + who);
			}
		else //Otherwisse, reprompt.
			jlab.setText("Please choose a name");
			
	}
	public static void main(String[] args) {
//		Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ListDemo(); 
				
			}
		});

	}

}
