package helloYeji;

import java.util.Scanner;

public class InnerclassManagament {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InnerclassManagement InnerclassManagement = new InnerclassManagement(input);
		
		int num = 1;
	
		while (num !=5) {
		System.out.println("1. Add class");
		System.out.println("2. Delete class");
		System.out.println("3. Edit class");
		System.out.println("4. view class");
		System.out.println("5. Exit");
		System.out.println("choose only one number between 1-6:");
		
		
		if (num == 1) {
		InnerclassManagement .Addclass();
		 }
		 else if (num == 2) {
		InnerclassManagement .Deleteclass();
		 
		}
		 else if (num == 3) {
		InnerclassManagement . Editclass();
		
			
		}
		 else if (num == 4) {
		InnerclassManagement .Viewclass();
		
		 }
		 
		}
	}
}
	 
	   