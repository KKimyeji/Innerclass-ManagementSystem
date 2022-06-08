package helloYeji;

import java.util.Scanner;

public class ChildrenInnerclass  extends Innerclass implements Input {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ChildrenInnerclass(Innerclasskind kind) {
		super (kind);
	}
	

	public void getUserInput(String input) {
		System.out.print("Innerclass ID: ");
		input.intern();
		String classId = input.intern();
		this.setclassID(classId);

		System.out.print("Innerclass Name: ");
		String className = input.intern();

		this.setclassname(className);

		System.out.print("Innerclass place : ");
		String classPlace = input.intern();
		this.setclassplace(classPlace);

		while (true) {
			try {
				System.out.print("Innerclass Time:");
				String classtime = input.intern();
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


	@Override
	public String getclasstime() {
		// TODO Auto-generated method stub
		return super.getclassTime();
	}


	@Override
	public void setclassname(String classname) {
		super.classname = classname;
		
	}


	@Override
	public void setclasstime(String classTime) {
		// TODO Auto-generated method stub
		
	}

	
}