package Munuchoice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ViewListener implements ActionListener {
	MacFrame f;

	public ViewListener(MacFrame f) {
    this.f = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton b = (JButton) e.getSource();
	InnerclassViewer icv = f.getInnerclassviewr1();
	f.setupPanel(icv);
	}

}
