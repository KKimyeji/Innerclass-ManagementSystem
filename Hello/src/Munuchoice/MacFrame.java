package Munuchoice;



import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import helloYeji.InnerclassManagament;



public class MacFrame extends JFrame{
	
	InnerclassManagament innerclassmanagement;
	 
    Menuchoice m ;
    InnerclassAdder innerclassadder ;
    InnerclassViewer Innerclassviewr ;
  
	
	public MacFrame(InnerclassManagament innerclassManagement) {
		this.innerclassmanagement = innerclassmanagement;
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("My Frame");

		
		
		this. m = new Menuchoice(this);
		this.Innerclassviewr = new InnerclassViewer(this, this.innerclassmanagement);  
		this.innerclassadder = new InnerclassAdder(this,this.innerclassmanagement);
	

		
		this.setVisible(true);
	}
	




	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public Menuchoice getMunuchoice() {
		return m;
	}
	public void setMenuchoice(Menuchoice m) {
    	this.m = m;
    }
    
    public InnerclassAdder getInnerclassadder() {
    	return innerclassadder;
    }
    public void setInnerclassadder(InnerclassAdder inerrclassadder) {
    	this.innerclassadder = inerrclassadder;
    }
    public InnerclassViewer getInnerclassviewr() {
		return Innerclassviewr;
    }
    
    public void setInnerclassviewr(InnerclassViewer icv) {
    	this.Innerclassviewr = icv;
    }


	
}
