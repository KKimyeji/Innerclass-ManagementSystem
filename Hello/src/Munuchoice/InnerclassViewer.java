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

import helloYeji.InnerclassManagement;
import helloYeji.Input;
import helloYeji.MenuManager;

public class InnerclassViewer extends JPanel {

	MacFrame f;
	InnerclassManagement innerclassManagement;
	
	public InnerclassViewer(MacFrame f, InnerclassManagement innerclassManagement) {
		this.f = f;
		this.innerclassManagement = innerclassManagement;
		System.out.println("###" + innerclassManagement.size() + "###");
		
		DefaultTableModel md = new DefaultTableModel();
		md.addColumn("Name");
		md.addColumn("Place");
		md.addColumn("ID");
		md.addColumn("Time");

		for (int i = 0; i < innerclassManagement.size(); i++) {
			Vector<String> row = new Vector<String>();
			Input in = innerclassManagement.get(i);
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
	

	

	public InnerclassManagement getInnerclassManagement() {
		return innerclassManagement;
	}

	public void setInnerclassManagement(InnerclassManagement innerclassManagement) {
		this.innerclassManagement = innerclassManagement;
		this.removeAll();
		System.out.println("###" + innerclassManagement.size() + "###");
		
		DefaultTableModel md = new DefaultTableModel();
		md.addColumn("Name");
		md.addColumn("Place");
		md.addColumn("ID");
		md.addColumn("Time");

		for (int i = 0; i < innerclassManagement.size(); i++) {
			Vector<String> row = new Vector<String>();
			Input in = innerclassManagement.get(i);
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

}
