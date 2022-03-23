package helloYeji;

import java.util.Scanner;

class InnerclassManagement {

	public static void main(String[] args) {
		int num =0;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		System.out.print("num"+ num);
		
		while (num !=6) {
		System.out.println("1. Add class");
		System.out.println("2. Delete class");
		System.out.println("3. Edit class");
		System.out.println("4. view class");
		System.out.println("5. show a Menu");
		System.out.println("6. Exit");
		System.out.println("choose only one number between 1-6:");
		
		
		if (num == 1) {
		      Addclass();
		 }
		 else if (num == 2) {
		      Deleteclass();
		 
		}
		 else if (num == 3) {
		      Editclass();
		
			
		}
		 else if (num == 4) {
		       Viewclass();
		
		 }
		 
		}
	}
	 
	    public static void Addclass() {
		Scanner input = new Scanner(System.in);
			System.out.println("classname");
			String classname = input.nextLine();
		
	}
	    public static void Deleteclass() {
	    Scanner input = new Scanner(System.in);
				System.out.println("classplace");
				String classplace = input.nextLine();
			
	    }

	    public static void Editclass() {
	    	Scanner input = new Scanner(System.in) ;
				System.out.println("classID");
				int classID = input.nextInt();
			
	    }
	    public static void Viewclass() {
	    	Scanner input = new Scanner(System.in);
				System.out.println("classtime");
				String classtime = input.nextLine();
			
	    }
}
	


