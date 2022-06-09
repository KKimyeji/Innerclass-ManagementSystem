package helloYeji;

import java.util.Scanner;

public interface Input {
	
	

    


	public String getclassname();

	public String getclassplace();

	public String getclassID();

	public String getclasstime();

	public void setkind(Innerclasskind kind);
	public void setclassname(String classname);
	public void setclassplace(String classplace);
	public void setclassTime(String classTime) throws IDException;
	public void setclassID(String classID);
	public void getUserInput(Scanner input) throws IDException;

	public void printInfo();

}

	
	 

