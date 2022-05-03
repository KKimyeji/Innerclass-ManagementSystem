package helloYeji;

import java.util.Scanner;

public class ChildrenInnerclass  extends Innerclass implements Input {
	


	public ChildrenInnerclass(Innerclasskind kind) {
		super (kind);
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
		 System.out.println("kind:"+ ckind + "classname:"+ classname + "classplace:"+ classplace + 
				 "classID:"+ classID + "calsstime:"+classtime+"OtherStudentclassID:"+ classID + "OtherStudentcalsstime:"+classtime); 
	
	 }

}
