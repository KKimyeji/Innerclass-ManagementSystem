package Munuchoice;


import java.awt.BorderLayout;



import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menuchoice  extends JPanel{
	

	MacFrame f;
	
	public Menuchoice(MacFrame f) {
		
		this.f = f;
		
		this.setLayout(new BorderLayout());
		
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
	    JLabel la = new JLabel("Menu choice");
	    
	   JButton b1 = new JButton("Add class");
	   JButton b2 = new JButton("View class");
	   JButton b3 = new JButton("Edit class");
	   JButton b4 = new JButton("Delete class");
	   JButton b5 = new JButton("Done");
	   
	   b1.addActionListener(new AddListener(f));
	   b2.addActionListener(new ViewListener(f));
		
		
		p1.add(la);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
	   this.add(p1, BorderLayout.NORTH);
	   this.add(p2, BorderLayout.CENTER);
	   
	  
	}

}
