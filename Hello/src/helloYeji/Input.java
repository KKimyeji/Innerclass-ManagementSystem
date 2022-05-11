package helloYeji;

import java.util.Scanner;

public interface Input {
	
	

    public void getUserInput(Scanner input);

	public String getclassname();

	public void setclassname(String classname1);

	public void setclassplace(String classplace) ;

	public void setclassID(String classID)throws IDException;

	public void setclasstime(String classtime);

	public void printInfo();
	 
	 
}
