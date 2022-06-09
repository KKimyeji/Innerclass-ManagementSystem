package Munuchoice;

import javax.swing.JButton;





import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;



import helloYeji.MenuManager;


public class InnerclassAdder extends JPanel {
	MacFrame f;
	MenuManager menumanager;

	public InnerclassAdder(MacFrame f, MenuManager menumanager) {
		this.f = f;
		this.menumanager = menumanager;

		JPanel p = new JPanel();
		p.setLayout(new SpringLayout());

		JLabel laName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		laName.setLabelFor(fieldName);
		p.add(laName);
		p.add(fieldName);

		JLabel laPlace = new JLabel("Place: ", JLabel.TRAILING);
		JTextField fieldPlace = new JTextField(10);
		laName.setLabelFor(fieldPlace);
		p.add(laPlace);
		p.add(fieldPlace);

		JLabel laTime = new JLabel("Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		laName.setLabelFor(fieldTime);
		p.add(laTime);
		p.add(fieldTime);

		JLabel laID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		laName.setLabelFor(fieldID);

		JButton saveButton = new JButton("save");
		saveButton.addActionListener(
				new ClassAdderListener(fieldName, fieldPlace, fieldTime, fieldID, menumanager));

		JButton cancelButton = new JButton("cancle");
		cancelButton.addActionListener(new ClassAdderCancelListener(f));

		p.add(laID);
		p.add(fieldID);

		p.add(saveButton);
		p.add(cancelButton);

		SpringUtilities.makeCompactGrid(p, 5, 2, 6, 6, 6, 6);

		this.add(p);
		this.setVisible(true);

	}

}
