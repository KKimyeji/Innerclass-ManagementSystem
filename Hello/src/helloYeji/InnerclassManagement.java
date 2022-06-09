package helloYeji;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
    
class InnerclassManagement implements Serializable{
	private static final long serialVersionUID = -4536141729705604246L;

	ArrayList<Input> classes = new ArrayList<Input>();
	transient Scanner input;

	InnerclassManagement(Scanner input) {
		this.input = input;
	}

	public void setScanner(Scanner input2) {
		this.input = input2;
	}

	public void addClass(String name, String Place, String Time, String ID) {
		Input Input = new ChildrenInnerclass(Innerclasskind.childclass);
		try {
			Input.getUserInput(input);
		} catch (IDException e) {
			e.printStackTrace();
		}
		classes.add(Input);
	}

	public void addClass(Input input) {
		classes.add(input);
	}

	public void Addclass() {
		Input Input;

		int kind = 0;

		while (kind < 1 || kind > 3) {
			try {
				System.out.println("The frist: childclass");
				System.out.println("The second: Oldageclass");
				System.out.println("The Third: Adultclass ");
				System.out.print("1,2,3번중 하나만 고르세요:");
				kind = input.nextInt();
				if (kind == 1) {
					Input = new ChildrenInnerclass(Innerclasskind.childclass);
					Input.getUserInput(input);
					classes.add(Input);
					break;
				} else if (kind == 2) {
					Input = new OldageclassInnerclass(Innerclasskind.Oldageclass);
					Input.getUserInput(input);
					classes.add(Input);
					break;
				} else if (kind == 3) {
					Input = new Adultclass(Innerclasskind.Adultclass);
					Input.getUserInput(input);
					classes.add(Input);
					break;
				} else {
					System.out.print("choose one:");
				}
			} catch (InputMismatchException e) {
				System.out.println("1번부터 3번 사이의 숫자만 고르세요!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			} catch (IDException e) {
				e.printStackTrace();
			}
		}

	}

	public void Deleteclass() {
		System.out.print("classname");
		String classname = input.nextLine();
		for (int i = 0; i < classes.size(); i++) {
			if (classes.get(i).getclassname() == classname) {
				classes.remove(classes.get(i));
			}
		}
	}

	public void addStudnet(String classname, String classplace, String classTime, String classID) {
		Input classInput = new ChildrenInnerclass(Innerclasskind.childclass);
		try {
			classInput.getUserInput(input);
		} catch (IDException e) {
			e.printStackTrace();
		}
		classes.add(classInput);
	}

	public void Editclass() {
		System.out.println("classname");
		String classname = input.next();
		for (int i = 0; i < classes.size(); i++) {
			Input Input = classes.get(i);
			if (Input.getclassname() == classname) {
				int num = -1;
				while (num != 5) {
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
					} else if (num == 3) {
						System.out.println("classTime: ");
						String classID = input.next();
						Input.setclassID(classID);

					} else if (num == 4) {
						System.out.println("classID: ");
						String classtime = input.next();
						try {
							Input.setclassTime(classtime);
						} catch (IDException e) {
							e.printStackTrace();
						}
					} else {
						continue;
					}
				}
				break;
			}

		}
	}

	public void Viewclass() {
		for (int i = 0; i < classes.size(); i++) {
			classes.get(i).printInfo();
		}

	}

	public int size() {
		return classes.size();
	}
	public Input get(int index) {
		return (Innerclass)classes.get(index);
	}
	
	
	
}
