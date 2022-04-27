package helloYeji;

import java.util.Scanner;

public class Innerclass {
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

 public void printInfo() {
	 String ckind = "nothing";
	 switch(this.kind) {
	 case childclass:
		 ckind = "child";
	     break;
	 case Oldageclass:
		 ckind = "Oldage";
	     break;
	 case Teenagerclass:
		 ckind = "Teenager";
	     break;
	 case Adultclass:
		 ckind = "Adult";
	     break;
	  default:  
		  
	 }
 
	 System.out.println("kind:"+ ckind + "classname:"+ classname + "classplace:"+ classplace + "classID:"+ classID + "calsstime:"+classtime);
 }
 public void getUserInput(Scanner input) {
		System.out.print("classname");
		String classname = input.next();
		this.setclassname(classname);
		
		System.out.print("classplace");
         String classplace = input.next();
         this.setclassplace(classplace);
		
         System.out.print("classID");
	   String classID = input.next();
	   this.setclassID(classID);
		
	   System.out.print("classtime");
		String classtime = input.next();
		this.setclasstime(classtime);
 }
}
