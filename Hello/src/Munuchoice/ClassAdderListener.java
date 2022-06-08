package Munuchoice;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import helloYeji.ChildrenInnerclass;

import helloYeji.InnerclassManagament;

import helloYeji.Innerclasskind;
import helloYeji.Input;

public class ClassAdderListener implements ActionListener {
	
	
	JTextField fieldName ;
	JTextField fieldPlace;
	JTextField fieldTime;
	JTextField fieldID;
	 InnerclassManagament innerclassmanagement;;
	
	public ClassAdderListener(JTextField fieldName,
			JTextField fieldPlace,JTextField fieldTime,
			JTextField fieldID, InnerclassManagament innerclassmanagement) {
	this.fieldName= fieldName;
	this.fieldPlace= fieldPlace;
	this.fieldTime= fieldTime;
	this.fieldID =fieldID ;
	this.innerclassmanagement=innerclassmanagement;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Input Innerclass = new ChildrenInnerclass(Innerclasskind.childclass);
		
		Innerclass.setclassname(fieldName.getName());
		Innerclass.setclassplace(fieldPlace.getText());
		Innerclass.setclasstime(fieldTime.getText());
		Innerclass.setClassID(fieldID.getText());
		innerclassmanagement.addInnerclass(Innerclass);
		putObject(innerclassmanagement,"innerclassManagement.ser");
		Innerclass.printInfo();
		
	}
	public static void putObject(InnerclassManagament innerclassManagement,String filename) {
		
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
