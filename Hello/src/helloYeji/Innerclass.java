package helloYeji;

import java.io.Serializable;
import java.util.Scanner;

public abstract class  Innerclass implements Input, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6757742969915250545L;
	
	protected Innerclasskind kind = Innerclasskind.childclass;
    protected  String classname;
	protected  String classplace;
	protected  String classID;
	protected String classtime;
	
 public Innerclass() {
	 
 }
 
 public Innerclass( Innerclasskind kind) {
	 this.kind = kind;
 }
 
 public Innerclass(String classname,String classplace) {
	 this.classname = classname;
	 this.classplace = classplace;
 }
 
 public Innerclass(String classname,String classplace,String classID, String classtime) {
	 this.classname = classname;
	 this.classplace = classplace;
	 this.classID = classID;
	 this.classtime = classtime;
 }
 
 public Innerclass(Innerclasskind kind,String classname,String classplace,String classID, String classtime) {
	 this.kind = kind;
	 this.classname = classname;
	 this.classplace = classplace;
	 this.classID = classID;
	 this.classtime = classtime;
     }
 
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
	
	public void setclassplace(String classplace)  {
		this.classplace = classplace;
	}

	
	public int getclassID() {
		return getclassID();
	}
	public void setclassID (String classID) throws IDException {
		
		if(!classID.contains(".") && !classID.equals("")) {
			throw new IDException();
				}
		this.classID = classID;
	  }

	
	
	public String getclasstime() {
		return getclasstime();
	}
	
	public void setclasstime (String classtime) {
		this.classtime = classtime;
	}
	

 public  abstract void printInfo();
	
public void getUserInput(Scanner input) {
}
	public void setclassname(Scanner input) {
		System.out.print("Innerclass Name:");
		String name = input.next();
		this.setclassname(name);
	}
	public void setclassplace(Scanner input) {
		System.out.print("Innerclass place:");
		classplace = input.next();
		
	 }
	
	public void setclassID(Scanner input) throws IDException {
		classID = " ";
		 while (!classID.contains(".")) {
		System.out.print("Innerclass ID:");
		this.setclassID(classID);
		try {
			this.setclassID(classID);
		} catch(IDException e) {
			System.out.println("정보에 . 을 포함하여 입력하세요.");
		}
	 }
	}
public String getKindString() {
	String skind = "none";
	switch(this.kind) {
	case  childclass:
		skind = "child";
		break;
	case  Oldageclass:
		skind = "old";
		break;
	case Teenagerclass:
		skind = "Teen";
		break;
	case  Adultclass:
		skind = "Adult";
		break;
	}
	return skind;
}

	
}


