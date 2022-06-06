package Munuchoice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class InnerclassAdder extends JPanel {
	MacFrame f;
	
	public InnerclassAdder(MacFrame f) {
		
		this.f = f;
		
		JPanel p = new JPanel();
		p.setLayout(new SpringLayout());
		
		JLabel laName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField (10);
		laName.setLabelFor(fieldName);
		p.add(laName);
		p.add(fieldName);
		
		
		JLabel laPlace = new JLabel("Place: ", JLabel.TRAILING);
		JTextField fieldPlace = new JTextField (10);
		laName.setLabelFor(fieldPlace);
		p.add(laPlace);
		p.add(fieldPlace);
		
		
		JLabel laTime = new JLabel("Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField (10);
		laName.setLabelFor(fieldTime);
		p.add(laTime);
		p.add(fieldTime);
		
		
		JLabel laID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField (10);
		laName.setLabelFor(fieldID);
		p.add(laID);
		p.add(fieldID);
		
		
		p.add(new JButton("save"));
		p.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(p,5,2,6,6,6,6);
		
		
		this.add(p);
		this.setVisible(true);
		
		}

}
