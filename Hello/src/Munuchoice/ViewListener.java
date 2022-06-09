package Munuchoice;



import java.awt.event.ActionEvent;





import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import helloYeji.MenuManager;




public class ViewListener implements ActionListener {
	MacFrame f;

	public ViewListener(MacFrame f) {
    this.f = f;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		InnerclassViewer innerclassviewer = f.getInnerclassviewer();
		MenuManager menumanager= getObject("InnerclassManagement.ser");
		innerclassviewer.setInnerclassManagament(menumanager);
		f.setupPanel(innerclassviewer);
	
	}
	
	public static MenuManager  getObject(String filename) {
		MenuManager menumanager= null;
		FileInputStream file;

		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);

			menumanager  = (MenuManager) obj.readObject();

			obj.close();
			file.close();

		} catch (FileNotFoundException e) {
			return menumanager ;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menumanager ;
	}

	

}
