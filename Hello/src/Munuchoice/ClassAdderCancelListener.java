package Munuchoice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassAdderCancelListener implements ActionListener{
	
	MacFrame f;

	public ClassAdderCancelListener(MacFrame f) {
		this.f=f;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		f.getContentPane().removeAll();
		f.getContentPane().add(f.getMunuchoice());
		f.revalidate();
		f.repaint();
		
	}

}
