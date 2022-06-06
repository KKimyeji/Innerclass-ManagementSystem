package Munuchoice;


import javax.swing.JFrame;
import javax.swing.JPanel;

import helloYeji.InnerclassManagament;


public class MacFrame extends JFrame{
	
	 InnerclassManagament innerclassmanagement;
    Menuchoice m ;
	InnerclassViewer icv ;
    InnerclassAdder innerclassadder ;
  
	
	public MacFrame() {
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("My Frame");

		
		this. innerclassmanagement = innerclassmanagement;
		this. m = new Menuchoice(this);
		this. icv = new InnerclassViewer(null, innerclassmanagement);
	    this. innerclassadder = new InnerclassAdder(this);
	   
	    
		
		this.setupPanel(m);
		
		
		
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
    public InnerclassViewer getInnerclassviewr1() {
		return icv;
    }
    
    public void setInnerclassviewr(InnerclassViewer icv) {
    	this.icv = icv;
    }


	public void setupPanel(InnerclassViewer icv2) {
		// TODO Auto-generated method stub
		
	}
}
