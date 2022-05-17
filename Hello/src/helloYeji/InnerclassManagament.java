package helloYeji;

import java.util.InputMismatchException;
import java.util.Scanner;

import Logging.IssueLogger;

public class InnerclassManagament {
	static IssueLogger logger = new IssueLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InnerclassManagement InnerclassManagement = new InnerclassManagement(input);
		
	    chooseMenu(input,InnerclassManagement);
	}
	private static void chooseMenu(Scanner input,InnerclassManagement InnerclassManagement) {
		int num = 1;	
		while (num !=5) {
		try {
		showMenu();
		num = input.nextInt();
		switch(num){
		case 1: 
		InnerclassManagement .Addclass();
		logger.log("Add class");
		 break;
		
		case 2:  
		InnerclassManagement .Deleteclass();
		logger.log("Delete class");
		break;
		
		case 3: 
		InnerclassManagement . Editclass();
		logger.log("Edit class");
		break;
		
		case 4: 
		InnerclassManagement .Viewclass();
		logger.log("View class");
		break;
		default:
			continue;
		  }
		  } catch(InputMismatchException e){
			  System.out.println("1번부터 5번 사이의 번호만 넣으세요!");
			 if(input.hasNext()) {
				 input.next();
			 }
			num = -1;
			
		  }
		 } 
	}
	
	
	private static void showMenu() {
		System.out.println("1. Add class");
		System.out.println("2. Delete class");
		System.out.println("3. Edit class");
		System.out.println("4. view class");
		System.out.println("5. Exit");
		System.out.println("choose only one number between 1-6:");
	}
}
	 
	   