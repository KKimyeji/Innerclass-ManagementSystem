package Munuchoice;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class AddListener implements ActionListener {
	
	MacFrame f;

	public AddListener(MacFrame f) {
		this.f=f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f.getContentPane().removeAll();
		f.getContentPane().add(f.getInnerclassadder());
		f.revalidate();
		f.repaint();
		
	}

}
