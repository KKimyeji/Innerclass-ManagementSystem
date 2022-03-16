package helloYeji;

import java.util.Scanner;

class InnerclassManagement {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
		System.out.println("1. Add class");
		System.out.println("2. Delete class");
		System.out.println("3. Edit class");
		System.out.println("4. view class");
		System.out.println("5. show a Menu");
		System.out.println("6. Exit");
		System.out.println("choose only one number between 1-6:");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("classname:");
			String classname = input.next();
			break;
		case 2:
			System.out.println("classplace:");
		    String classplace = input.next();
		    break;
		case 3:
			System.out.println("clasID:");
	        String classID = input.next();
	        break;
			
		case 4:
			System.out.println("classTime:");
            String classTime = input.next();
            break;
			
		}
		
			
		}
		
		}
	}

	


