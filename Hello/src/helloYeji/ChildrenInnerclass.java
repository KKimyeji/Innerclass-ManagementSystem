package helloYeji;


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
	

	 
}

