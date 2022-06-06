package Munuchoice;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import helloYeji.InnerclassManagament;
import helloYeji.Input;

public class InnerclassViewer {

	
	
		MacFrame f;
		
		InnerclassManagament innerclassmanagement;
		
		public InnerclassManagament innerclassmanagement() {
			return innerclassmanagement;
		}
		
		public void setInnerclassManagament(InnerclassManagament innerclassmanagement) {
			this.innerclassmanagement= innerclassmanagement;
			
		
			
			DefaultTableModel md = new DefaultTableModel();
			md.addColumn("Name");
			md.addColumn("Place");
			md.addColumn("ID");
			md.addColumn("Time");
				
			for(int i =0; i < InnerclassManagament.size(); i++) {
				Vector row = new Vector();
				Input in = InnerclassManagament.get(i);
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
		
public  InnerclassViewer(MacFrame f, InnerclassManagament innerclassmanagement) {
			ArrayList<Input> classes = new ArrayList<Input>();
			this.f=f;
			this.innerclassmanagement = innerclassmanagement;
			System.out.println("###"+ innerclassmanagement.size()+ "###");
}



		private void add(JScrollPane sp) {
			// TODO Auto-generated method stub
			
		}

}
