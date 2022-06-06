package helloYeji;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Logging.IssueLogger;
import Munuchoice.MacFrame;

public class InnerclassManagament {
	static IssueLogger logger = new IssueLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InnerclassManagement InnerclassManagement = getObject("InnerclassManagement.ser");
		if(InnerclassManagement == null) {
	   InnerclassManagement innerclassmanagement = new InnerclassManagement(input);
			
		}
		
		MacFrame f = new MacFrame();
	    chooseMenu(input,InnerclassManagement);
	    putObject(InnerclassManagement,"InnerclassManagement.ser");
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
	
	public void veiwInnerclasses() {
		ArrayList <Input> classes = new ArrayList <Input>();
		System.out.println("# of registered Innerclasses:"+ classes.size());
		for(int i = 0; i <classes.size(); i ++) {
			classes.get(i).printInfo();
		}
	}
	
	public int size() {
		return 0;
	}
	public static Input get(int index) {
		ArrayList <Input> classes = new ArrayList <Input>();
		return (Innerclass) classes.get(index);
	}
	
	private static void showMenu() {
		System.out.println("1. Add class");
		System.out.println("2. Delete class");
		System.out.println("3. Edit class");
		System.out.println("4. view class");
		System.out.println("5. Exit");
		System.out.println("choose only one number between 1-6:");
	}
	
	public static InnerclassManagement getObject(String filename) {
		InnerclassManagement InnerclassManagement = null;
		FileInputStream file;
		
		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);
			
			InnerclassManagement= (InnerclassManagement)obj.readObject();
			
			obj.close();
			file.close();	
			
		} catch (FileNotFoundException e) {
			return  InnerclassManagement;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return InnerclassManagement;
	}
	
	public static void putObject(InnerclassManagement InnerclassManagement,String filename) {
	
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(InnerclassManagement);
			
			out.close();
			file.close();	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	}
	 
	   