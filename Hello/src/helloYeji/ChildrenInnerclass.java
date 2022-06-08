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
	

	public void getUserInput(String input) throws IDException {
			setclassname(input);
			setclassplace(input);
			setclassID(input);
			setclasstime(input);
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
	public void setclasstime(String classtime) {
		// TODO Auto-generated method stub
		
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
	public void setClassID(String input) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setClassTime(Scanner input) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setClassID(Scanner input) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}