package helloYeji;

import java.util.ArrayList;
import java.util.Scanner;
    
class InnerclassManagement {
	ArrayList <Input> classes = new ArrayList <Input>();
	Scanner input;	
	InnerclassManagement(Scanner input){
		this.input = input;
	}
	
	    public  void Addclass() {
	    	int kind = 0;
	    	Input Input;
	    	while(kind != 1 && kind != 2) {
	    	System.out.println("The frist: childclass");
	    	System.out.println("The second: Oldageclass");
	    	System.out.println("The Third: Adultclass ");
	    	System.out.print("1,2,3번 중 고르시오:");
	    	kind = input.nextInt();
	    	if(kind == 1) {
			 Input = new ChildrenInnerclass(Innerclasskind.childclass);
			 Input.getUserInput(input);
			 classes.add(Input);
			
	    		break;
	    	}
	    	else if(kind == 2) {
		    Input = new OldageclassInnerclass(Innerclasskind.Oldageclass);
		     ((helloYeji.Input) classes).getUserInput(input);
		     classes.add(Input);
	    		break;
	    	}
	    	else if(kind == 3) {
			    Input = new Adultclass(Innerclasskind.Adultclass);
			     ((helloYeji.Input) classes).getUserInput(input);
			     classes.add(Input);
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
				for(int i =0; i< classes.size(); i ++) {
					if(classes.get(i).getclassname() == classname) {
					 classes.remove(classes.get(i));
					}
				}
	    }

	    public  void Editclass() {
				System.out.println("classname");
				String classname = input.next();
				for(int i=0; i<classes.size(); i ++) {
					Input Input = classes.get(i);
					if(Input.getclassname() == classname) {
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
								Input.setclassname(classname1);
							}
								
								 else if (num == 2) {
									 System.out.println("classplace: ");
										String classplace = input.next();
								Input.setclassplace(classplace);
								}
								 else if (num == 3) {
									 System.out.println("classID: ");
										String classID = input.next();
								Input.setclassID(classID);
									
								}
								 else if (num == 4) {
									 System.out.println("classtime: ");
										String classtime = input.next();
										Input.setclasstime(classtime);
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
	


