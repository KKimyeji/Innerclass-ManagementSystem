package Munuchoice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AddListener implements ActionListener {
	
	MacFrame f;

	public AddListener(MacFrame f) {
		this.f=f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		InnerclassAdder innerclassadder = f.getInnerclassadder();
		f.setupPanel(innerclassadder);
		
	}

}
