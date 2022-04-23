package helloYeji;

import java.util.ArrayList;
import java.util.Scanner;
    
class InnerclassManagement {
	ArrayList <Innerclass> classes = new ArrayList <Innerclass>();
	Scanner input;	
	InnerclassManagement(Scanner input){
		this.input = input;
	}
	
	    public  void Addclass() {
	    	int kind = 0;
	    	Innerclass classes;
	    	while(kind != 1 && kind != 2) {
	    	System.out.print("The frist: childclass");
	    	System.out.print("The second: Oldageclass");
	    	System.out.print("1번과 2번 중 고르시오:");
	    	kind = input.nextInt();
	    	if(kind == 1) {
			 classes = new Innerclass();
			 classes.getUserInput(input);
			
	    		break;
	    	}
	    	else if(kind == 2) {
		     classes = new OldageclassInnerclass();
		     classes.getUserInput(input);
	    		break;
	    	}
	    	else {
	    		System.out.print("choose one:");
	    	 }
	    	}
		
			
			
	    	}
	
	    public  void Deleteclass() {
				System.out.print("classname");
				String classname = input.nextLine();
				int index = -1;
				for(int i =0; i< classes.size(); i ++) {
					if(classes.get(i).getclassname() == classname) {
						index = 1;
						break;
					}
				}
	    }

	    public  void Editclass() {
				System.out.println("classname");
				String classname = input.next();
				for(int i=0; i<classes.size(); i ++) {
					Innerclass Innerclass = classes.get(i);
					if(Innerclass.getclassname() == classname) {
						int num = -1;
						while ( num != 5) {
							System.out.println("1. Add class");
							System.out.println("2. Delete class");
							System.out.println("3. Edit class");
							System.out.println("4. view class");
							System.out.println("5. Exit");
							System.out.println("choose only one number between 1-6:");
							num = input.nextInt();
							if (num == 1) {
								System.out.println("classname: ");
								String classname1 = input.next();
								Innerclass.setclassname(classname1);
							}
								
								 else if (num == 2) {
									 System.out.println("classplace: ");
										String classplace = input.next();
								 Innerclass.setclassplace(classplace);
								}
								 else if (num == 3) {
									 System.out.println("classID: ");
										String classID = input.next();
								Innerclass.setclassID(classID);
									
								}
								 else if (num == 4) {
									 System.out.println("classtime: ");
										String classtime = input.next();
										Innerclass.setclasstime(classtime);
						}
								 else {
									 continue;
								 }
					}
						break;
				}
			
	       }
	    }
	    public  void Viewclass() {
				for( int i = 0; i < classes.size(); i ++) {
					classes.get(i).printInfo();
				}

				
			
	    }
}
	


