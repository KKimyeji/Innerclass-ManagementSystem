package Munuchoice;



import java.awt.event.ActionEvent;





import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import helloYeji.InnerclassManagement;
import helloYeji.MenuManager;




public class ViewListener implements ActionListener {
	MacFrame f;

	public ViewListener(MacFrame f) {
    this.f = f;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		InnerclassViewer innerclassviewer = f.getInnerclassviewer();
		InnerclassManagement innerclassManagement = getObject("InnerclassManagement.ser");
		innerclassviewer.setInnerclassManagement(innerclassManagement);
		f.setupPanel(innerclassviewer);
	
	}
	
	public static InnerclassManagement getObject(String filename) {
		System.out.println(filename);
		InnerclassManagement innerclassManagement = null;
		FileInputStream file;
		
		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);
			innerclassManagement = (InnerclassManagement) obj.readObject();
			obj.close();
			file.close();

		} catch (FileNotFoundException e) {
			return innerclassManagement ;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return innerclassManagement;
	}

	

}
