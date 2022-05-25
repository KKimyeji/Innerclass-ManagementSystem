package Logging;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class InnerclassViewr extends JFrame{
	
	public InnerclassViewr() {
		DefaultTableModel m = new DefaultTableModel();
		m.addColumn("ClassName");
		m.addColumn("Classplace");
		m.addColumn("Classtime");
		m.addColumn("ClassID");
		
		
		JTable t = new JTable(m);
		JScrollPane s = new JScrollPane(t);
		
		
		this.add(s);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
