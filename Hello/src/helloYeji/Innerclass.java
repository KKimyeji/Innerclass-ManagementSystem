package helloYeji;

import java.util.Scanner;

public abstract class  Innerclass {
	protected Innerclasskind kind = Innerclasskind.childclass;
    protected  String classname;
	protected  String classplace;
	protected  String classID;
	protected String classtime;
	
   public Innerclasskind getkind() {
		return kind;
	}
	
	public void setkind (Innerclasskind kind) {
		this.kind = kind;
	}
	
	public String getclassname() {
		return getclassname();
	}
	
	public void setclassname(String classname) {
		this.classname = classname;
	}
	
	public String  getclassplace() {
		return getclassplace();
	}
	
	public void setclassplace(String classplace) {
		this.classplace = classplace;
	}
	
	public int getclassID() {
		return getclassID();
	}
	public void setclassID (String classID2) {
		this.classID = classID2;
	}
	
	public String getclasstime() {
		return getclasstime();
	}
	
	public void setclasstime (String classtime) {
		this.classtime = classtime;
	}
	
	
 public Innerclass() {
	 
 }
 
 public Innerclass( Innerclasskind kind) {
	 this.kind = kind;
 }
 
 
 public Innerclass(Innerclasskind kind,String classname,String classplace,String classID, String classtime) {
	 this.kind = kind;
	 this.classname = classname;
	 this.classplace = classplace;
	 this.classID = classID;
	 this.classtime = classtime;
     }

 public  abstract void printInfo();
	
public void getUserInput(Scanner input) {

	
}


	
}


