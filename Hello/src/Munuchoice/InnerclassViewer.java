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

public class InnerclassViewer<InnerclassManagemet> extends JPanel {

MacFrame f;
InnerclassManagemet innerclassmanagement;

public InnerclassViewer(MacFrame f, InnerclassManagemet innerclassmanagement) {
	ArrayList<Input> classes = new ArrayList<Input>();
	this.f = f;
	this.innerclassmanagement = innerclassmanagement;

}
public void setInnerclassManagament(InnerclassManagemet innerclassmanagement) {
	this.innerclassmanagement = innerclassmanagement;
	System.out.println("###" + ((ArrayList<Input>) innerclassmanagement).size() + "###");
	DefaultTableModel md = new DefaultTableModel();
	md.addColumn("Name");
	md.addColumn("Place");
	md.addColumn("ID");
	md.addColumn("Time");

	for (int i = 0; i < ((ArrayList<Input>) innerclassmanagement).size(); i++) {
		Vector<String> row = new Vector<String>();
		Input in = ((ArrayList<Input>) innerclassmanagement).get(i);
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

public InnerclassManagemet getinnerclassmanagement() {
	return innerclassmanagement;
}
public void seInnerclassManagement(InnerclassManagemet innerclassmanagement) {
	this.innerclassmanagement = innerclassmanagement;
}



}
