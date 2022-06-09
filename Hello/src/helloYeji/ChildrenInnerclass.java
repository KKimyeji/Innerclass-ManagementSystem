package helloYeji;

import java.util.Scanner;

public class ChildrenInnerclass extends Innerclass implements Input {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChildrenInnerclass(Innerclasskind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Innerclass ID: ");
		input.nextLine();
		String classId = input.nextLine();
		this.setclassID(classId);

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
				System.out.println("�젙蹂댁뿉 : �쓣 �룷�븿�븯�뿬 �엯�젰�븯�꽭�슂.");
			}
		}

	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + ", classname: " + classname + ", classplace: " + classplace
				+ ", classID: " + classID + ", calsstime: " + classTime + ", OtherStudentclassID: " + classID
				+ ", OtherStudentcalsstime: " + classTime);

	}

	@Override
	public String getclasstime() {
		// TODO Auto-generated method stub
		return super.getclassTime();
	}
	
	public void setclassname(String classname) {
		super.classname = classname;
	}
	
	

}