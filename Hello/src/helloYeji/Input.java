package helloYeji;

import java.util.Scanner;

public interface Input {
	
	

    
	public String getclassname();

	public void setclassname(String classname1);
	
	public String getclassplace();

	public void setclassplace(String classplace) ;
	
	public String getclassID();

	public void setclassID(String classID)throws IDException;
	
	public String getclasstime();

	public void setclasstime(String classtime);
	
	public void getUserInput(Scanner input);

	public void printInfo();
	
	public void setClassName(Scanner input);
	
	public void setClassPlace(Scanner input);
	
	public void setClassID(Scanner input);
	
	public void setClassTime(Scanner input);
	 
	 
}
