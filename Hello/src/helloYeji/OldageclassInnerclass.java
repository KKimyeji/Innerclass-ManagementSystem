package helloYeji;

import java.util.Scanner;

public class OldageclassInnerclass extends Innerclass implements Input {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OldageclassInnerclass( Innerclasskind kind) {
		 super (kind);
	 }
	 
	 public void getUserInput(Scanner input) {
		 try {
				setclassID(input);
			} catch (IDException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.print("Innerclass Name: ");
			String className = input.nextLine();
			this.setclassname(className);

			System.out.print("Innerclass place : ");
			String classPlace = input.nextLine();
			this.setclassplace(classPlace);

			while (true) {
				try {
					System.out.print("Innerclass Time:");
					String classtime = input.nextLine();
					this.setclassTime(classtime);
					break;
				} catch (IDException e) {
					
				}
			}
	 }
	 
	 public void printInfo() {
			String skind = getKindString(); 
			 System.out.println("kind:"+ skind + "classname:"+ classname + "classplace:"+ classplace + 
					 "classID:"+ classID + "calsstime:"+classTime+"OtherStudentclassID:"+ classID + "OtherStudentcalsstime:"+classTime); 
		 }
	public void setclassID(Scanner input) throws IDException {		
	         char answer = 'X';
	         while(answer != 'T' && answer != 't' && answer != 'F' && answer != 'f') {
	         System.out.print("You have classID: T/F");
	         answer = input.next().charAt(0);
	         input.nextLine();
	         
	         if(answer == 't'|| answer == 'T') {
	        	 
	        	 System.out.print("classID");
	        	 String classID = input.nextLine();
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



