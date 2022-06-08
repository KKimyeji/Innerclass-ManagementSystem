package Munuchoice;



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



import helloYeji.InnerclassManagament;


public class ViewListener implements ActionListener {
	MacFrame f;

	public ViewListener(MacFrame f) {
    this.f = f;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		InnerclassViewer innerclassviewer = f.getInnerclassviewer();
		InnerclassManagament innerclassManagement = getObject("InnerclassManagement.ser");
		innerclassviewer.setInnerclassManagament(innerclassManagement);
		
	f.getContentPane().removeAll();
	f.setContentPane(innerclassviewer);
	f.revalidate();
	f.repaint();
	}
	
	public static InnerclassManagament getObject(String filename) {
		InnerclassManagament InnerclassManagement = null;
		FileInputStream file;
		
		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);
			
			InnerclassManagement= (InnerclassManagament)obj.readObject();
			
			obj.close();
			file.close();	
			
		} catch (FileNotFoundException e) {
			return  InnerclassManagement;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return InnerclassManagement;
	}

}
