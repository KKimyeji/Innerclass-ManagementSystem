package Munuchoice;





import javax.swing.JFrame;







import javax.swing.JPanel;



import helloYeji.MenuManager;



public class MacFrame<InnerclassManagement> extends JFrame{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	InnerclassManagement innerclassmanagement;
    Menuchoice m ;
    InnerclassAdder innerclassadder ;
    InnerclassViewer Innerclassviewer ;
  
	
	public MacFrame(InnerclassManagement innerclassmanagement) {
	
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("My Frame");

		
	    this. innerclassmanagement =  innerclassmanagement;
		this. m = new Menuchoice(this);
		this.Innerclassviewer = new InnerclassViewer(this, this. innerclassmanagement);  
		this.innerclassadder = new InnerclassAdder(this,this. innerclassmanagement);
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
    public InnerclassViewer getInnerclassviewer() {
		return Innerclassviewer;
    }
    
    public void setInnerclassviewr(InnerclassViewer icv) {
    	this.Innerclassviewer = icv;
    	
    }





	


	
}
