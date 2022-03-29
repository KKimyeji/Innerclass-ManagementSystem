package helloYeji;

import java.util.Scanner;
    
class InnerclassManagement {
	Innerclass Innerclass;
	Scanner input;	
	InnerclassManagement(Scanner input){
		this.input = input;
	}
	
	    public  void Addclass() {
	    	Innerclass = new Innerclass();
			System.out.println("classname");
			Innerclass. classname = input.next();
			System.out.println("classplace");
			Innerclass. classplace = input.next();
			System.out.println("classID");
			Innerclass. classID = input.nextInt();
			System.out.println("classtime");
			Innerclass. classtime = input.next();
		
	}
	    public  void Deleteclass() {
				System.out.println("classname");
				String classname = input.next();
				
				if(Innerclass == null) {
					System.out.println("The classname doesn't exist");
					return;
				}
			
				if(Innerclass.classname == classname) {
				Innerclass = null;
				System.out.println("The classname dosen't have yet");
				
			}
	    }

	    public  void Editclass() {
				System.out.println("classname");
				String classname = input.next();
				if(Innerclass.classname == classname) {
					System.out.println("The classname has been edited:"+classname);
					
				}
			
	    }
	    public  void Viewclass() {
				System.out.println("classname");
				String classname = input.next();
				if(Innerclass.classname == classname) {
					Innerclass.printInfo();
				}

				
			
	    }
}
	


