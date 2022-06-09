package Munuchoice;

import java.awt.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import helloYeji.Input;
import helloYeji.MenuManager;

public class InnerclassViewer extends JPanel {

MacFrame f;
MenuManager menumanager;

public InnerclassViewer(MacFrame f, MenuManager menumanager) {
	ArrayList<Input> classes = new ArrayList<Input>();
	this.f = f;
	this.menumanager = menumanager;

}
public void setInnerclassManagament(MenuManager menumanager) {
	this.menumanager = menumanager;
	System.out.println("###" + menumanager.size() + "###");
	DefaultTableModel md = new DefaultTableModel();
	md.addColumn("Name");
	md.addColumn("Place");
	md.addColumn("ID");
	md.addColumn("Time");

	for (int i = 0; i < menumanager.size(); i++) {
		Vector<String> row = new Vector<String>();
		Input in = menumanager.get(i);
		row.add(in.getclassname());
		row.add(in.getclassplace());
		row.add(in.getclassID());
		row.add(in.getclasstime());
		md.addRow(row);
	}

	JTable table = new JTable(md);
	JScrollPane sp = new JScrollPane(table);

	this.add(sp);

}

public MenuManager getMenuManager() {
	return menumanager;
}
public void setMenuManager(MenuManager menumanager) {
	this.menumanager = menumanager;
}



}
