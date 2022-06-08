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
	
	public InnerclassManagament(Scanner input) {
		
	}


	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		InnerclassManagament innerclassManagement = getObject("InnerclassManagement.ser");
		if(innerclassManagement == null) {
	   innerclassManagement = new InnerclassManagament(input);
			
		}
		
		else {
			 innerclassManagement.setScanner(input);
		}
		

		InnerclassManagament innerclassManagament = null;
		MacFrame frame = new MacFrame(innerclassManagament);
	    chooseMenu(input,innerclassManagement);
	    putObject(innerclassManagement,"innerclassManagement.ser");
	}
	

	private void setScanner(Scanner input) {
		
		
	}


	private static void chooseMenu(Scanner input,InnerclassManagament innerclassManagement)  {
		int num = 1;	
		while (num !=5) {
		try {
		showMenu();
		num = input.nextInt();
		switch(num){
		case 1: 
		innerclassManagement .Addclass();
		logger.log("Add class");
		 break;
		
		case 2:  
		innerclassManagement .Deleteclass();
		logger.log("Delete class");
		break;
		
		case 3: 
		innerclassManagement . Editclass();
		logger.log("Edit class");
		break;
		
		case 4: 
		innerclassManagement .Viewclass();
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
	
	private void Viewclass() {
		// TODO Auto-generated method stub
		
	}


	private void Editclass() {
		// TODO Auto-generated method stub
		
	}


	private void Deleteclass() {
		// TODO Auto-generated method stub
		
	}


	private void Addclass() {
		// TODO Auto-generated method stub
		
	}


	public void veiwInnerclasses() {
		ArrayList <Input> classes = new ArrayList <Input>();
		System.out.println("# of registered Innerclasses:"+ classes.size());
		for(int i = 0; i <classes.size(); i ++) {
			classes.get(i).printInfo();
		}
	}
	
	
	private static void showMenu()  {
		System.out.println("1. Add class");
		System.out.println("2. Delete class");
		System.out.println("3. Edit class");
		System.out.println("4. view class");
		System.out.println("5. Exit");
		System.out.println("choose only one number between 1-6:");
	}
	
	public static InnerclassManagament getObject(String filename) {
		InnerclassManagament InnerclassManagement = null;
		FileInputStream file;
		
		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);
			
			InnerclassManagement= (InnerclassManagament)obj.readObject();
			
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
	
	public static void putObject(InnerclassManagament innerclassManagement,String filename) {
	
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(innerclassManagement);
			
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


	public void addClass(Input innerclass) {
		// TODO Auto-generated method stub
		
	}


	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	public static Input get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	 
	   