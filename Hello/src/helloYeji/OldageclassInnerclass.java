package helloYeji;

import java.util.Scanner;

public class OldageclassInnerclass extends Innerclass {
	 public void getUserInput(Scanner input) {
			System.out.print("classname");
			String classname = input.next();
			this.setclassname(classname);
			
			System.out.print("classplace");
	         String classplace = input.next();
	         this.setclassplace(classplace);
			
	         char answer = 'X';
	         while(answer != 'T' && answer != 't' && answer != 'F' && answer != 'f') {
	         System.out.print("You have classID: T/F");
	         answer = input.next().charAt(0);
	         if(answer == 't'|| answer == 'T') {
	        	 System.out.print("classID");
	         String classID = input.next();
	  		   this.setclassID(classID);
	        	 break;
	         }
	         else if(answer == 'f' || answer == 'F') {
	        	 this.setclassID("");
	        	 break;
	         }
	         else {
	        	 
	         }
	 }        
	        
			
		   System.out.print("classtime");
			String classtime = input.next();
			this.setclasstime(classtime);
}
}

