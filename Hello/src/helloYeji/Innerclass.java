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
	protected  String classTime;
	protected String classID;
	
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
	 this.classTime = classtime;
	 this.classID = classID;
 }
 
 public Innerclass(Innerclasskind kind,String classname,String classplace,String classID, String classtime) {
	 this.kind = kind;
	 this.classname = classname;
	 this.classplace = classplace;
	 this.classTime = classtime;
	 this.classID = classID;
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

	
	public String getclassTime() {
		return getclasstime();
	}
	public void setclassTime (String classtime) throws IDException {
		
		if(!classTime.contains(":") && !classTime.equals("")) {
			throw new IDException();
				}

	this.classTime = classTime;
 }
	
	public String getclassID() {
		return getclassID();
	}
	
	public void setclassID (String classID) {
		this.classID = classID;
	}
	

 public  abstract void printInfo();
	
public void getUserInput(Scanner input) throws IDException {
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
	
	public void setclassTime(Scanner input) throws IDException {
		classTime = " ";
		 while (!classTime.contains(":")) {
		System.out.print("Innerclass Time:");
		this.setclassTime(classTime);
		try {
			this.setclassTime(classTime);
		} catch(IDException e) {
			System.out.println("정보에 : 을 포함하여 입력하세요.");
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

protected abstract int size();



	
}


