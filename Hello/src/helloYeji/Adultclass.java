package helloYeji;

import java.util.Scanner;

public class Adultclass extends Innerclass implements Input {
	 
	protected  String OtherStuendtclassID;
	protected String OtherStudentclasstime;
	
	public Adultclass( Innerclasskind kind) {
		 super (kind);
	 }

	
	
	 public void getUserInput(Scanner input) {
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
	         try {
	        	 
	         
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
	 }     catch(IDException e) {
		 System.out.println("정보에 . 을 포함하여 입력하세요.");
			
	        
	           }		
	         }
	 }
	 public void printInfo() {
				String skind = getKindString(); 
				 System.out.println("kind:"+ skind + "classname:"+ classname + "classplace:"+ classplace + 
						 "classID:"+ classID + "calsstime:"+classtime+"OtherStudentclassID:"+ classID + "OtherStudentcalsstime:"+classtime); 
			 
}



	@Override
	protected int size() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String getclassID() {
		return getclassID();
		
	}



	@Override
	public void setClassName(Scanner input) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setClassPlace(Scanner input) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setClassID(Scanner input) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setClassTime(Scanner input) {
		// TODO Auto-generated method stub
		
	}
}





