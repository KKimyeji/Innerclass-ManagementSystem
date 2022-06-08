package Munuchoice;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import helloYeji.InnerclassManagament;
import helloYeji.Input;

public class InnerclassViewer extends JPanel {

	
	
		/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

		MacFrame f;
		
		InnerclassManagament innerclassmanagement;
		
		public InnerclassViewer(MacFrame f, InnerclassManagament innerclassManagement) {
			ArrayList<Input> classes = new ArrayList<Input>();
			this.f = f;
			this.innerclassmanagement = innerclassManagement;

		}
		
		public void setInnerclassManagament(InnerclassManagament innerclassmanagement) {
			this.innerclassmanagement= innerclassmanagement;
			
		System.out.println("###"+ InnerclassManagament.size() + "###");
			
			DefaultTableModel md = new DefaultTableModel();
			md.addColumn("Name");
			md.addColumn("Place");
			md.addColumn("ID");
			md.addColumn("Time");
				
			for(int i =0; i < InnerclassManagament.size(); i++) {
				Vector<String> row = new Vector<String>();
				Input in = innerclassmanagement.get(i);
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
		public InnerclassManagament getInnerclassManagement() {
			return innerclassmanagement;
		}
		
		public void setInnerclassManagement(InnerclassManagament innerclassManagement) {
			this.innerclassmanagement = innerclassManagement;
		}



}
