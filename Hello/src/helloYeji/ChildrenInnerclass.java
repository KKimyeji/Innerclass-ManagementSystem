package helloYeji;

import java.util.Scanner;

public class ChildrenInnerclass  extends Innerclass implements Input {
	


	public ChildrenInnerclass(Innerclasskind kind) {
		super (kind);
	}
	

	 public void printInfo() {
		 String skind = getKindString();
		
		 
		 System.out.println("kind:"+ skind + "classname:"+ classname + "classplace:"+ classplace + 
				 "classID:"+ classID + "calsstime:"+classtime+"OtherStudentclassID:"+ classID + "OtherStudentcalsstime:"+classtime); 
	
}

	public void getUserInput(String input) throws IDException {
			setclassname(input);
			setclassplace(input);
			setclassID(input);
			setclasstime(input);
	 }


	@Override
	protected int size() {
		// TODO Auto-generated method stub
		return 0;
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

