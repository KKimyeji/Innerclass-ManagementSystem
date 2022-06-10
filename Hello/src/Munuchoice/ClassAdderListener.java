package Munuchoice;


import java.awt.event.ActionEvent;





import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import helloYeji.ChildrenInnerclass;
import helloYeji.IDException;
import helloYeji.InnerclassManagement;
import helloYeji.Innerclasskind;
import helloYeji.Input;
import helloYeji.MenuManager;

public class ClassAdderListener implements ActionListener {
	
	JTextField fieldName;
	JTextField fieldPlace;
	JTextField fieldTime;
	JTextField fieldID;
	InnerclassManagement innerclassManagement;
	
	public ClassAdderListener(JTextField fieldName, JTextField fieldPlace, JTextField fieldTime, JTextField fieldID,
			InnerclassManagement innerclassManagement) {
		this.fieldName = fieldName;
		this.fieldPlace = fieldPlace;
		this.fieldTime = fieldTime;
		this.fieldID = fieldID;
		this.innerclassManagement = innerclassManagement;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Input Innerclass = new ChildrenInnerclass(Innerclasskind.childclass);
		Innerclass.setclassname(fieldName.getText());
		Innerclass.setclassplace(fieldPlace.getText());
		try {
			Innerclass.setclassTime(fieldTime.getText());
		} catch (IDException e1) {
			// TODO Auto-generated catch block
			System.out.println("Please enter it again");
			fieldTime.setText("");
			// e1.printStackTrace();
		}
		Innerclass.setclassID(fieldID.getText());
		innerclassManagement.addClass(Innerclass);
		putObject(innerclassManagement, "innerclassManagement.ser");
		Innerclass.printInfo();

	}

	public static void putObject(InnerclassManagement innerclassManagement, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(innerclassManagement);
			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
