package helloYeji;

import java.util.Scanner;

public class Adultclass extends Innerclass implements Input {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected  String OtherStuendtclassID;
	protected String OtherStudentclasstime;
	
	public Adultclass( Innerclasskind kind) {
		 super (kind);
	 }

	
	
	 public void getUserInput(Scanner input) throws IDException {
			System.out.print("classname");
			String classname = input.next();
			this.setclassname(classname);
			
			System.out.print("classplace");
	         String classplace = input.next();
	         this.setclassplace(classplace);
			
	         char answer = 'X';
	         while(answer != 'T' && answer != 't' && answer != 'F' && answer != 'f') {
	         System.out.print("You have OtherStudent classID: T/F");
	         answer = input.next().charAt(0);
	         if(answer == 't'|| answer == 'T') {
	        	 System.out.print("OtherStudent classID:");
	  		  setclassID(classID);
		         
	        	break;
	         }
	         else if(answer == 'f' || answer == 'F') {
	        	 this.setclassID("");
	        	 break;
	         }
	         else {
	        	 
	         }		
	         }
	 }
	 public void printInfo() {
				String skind = getKindString(); 
				 System.out.println("kind:"+ skind + "classname:"+ classname + "classplace:"+ classplace + 
						 "classID:"+ classID + "calsstime:"+classTime+"OtherStudentclassID:"+ classID + "OtherStudentcalsstime:"+classTime); 
			 
}



	@Override
	public String getclasstime() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setclasstime(String classTime) {
		// TODO Auto-generated method stub
		
	}



	


	
}





