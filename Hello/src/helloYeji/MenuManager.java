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

public class MenuManager {
	static IssueLogger logger = new IssueLogger("log.txt");

	public MenuManager(Scanner input) {
		
	}

	public static void main(String[] args, MenuManager menumanger) {

		Scanner input = new Scanner(System.in);
		MenuManager menumanager = getObject("MenuManager.ser");
		if (menumanager == null) {
			menumanager = new MenuManager(input);
		} else {
			menumanager.setScanner(input);
		}

		MacFrame frame = new MacFrame(menumanger);
		chooseMenu(input, menumanager);
		putObject(menumanager, "MenuManager.ser");
	}

	private void setScanner(Scanner input) {
		// TODO Auto-generated method stub
		
	}

	private static void chooseMenu(Scanner input, MenuManager menumanager) {
		int num = 1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch (num) {
				case 1:
					menumanager.Addclass();
					logger.log("Add class");
					break;

				case 2:
					menumanager.Deleteclass();
					logger.log("Delete class");
					break;

				case 3:
					menumanager.Editclass();
					logger.log("Edit class");
					break;

				case 4:
					menumanager.Viewclass();
					logger.log("View class");
					break;
				default:
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("1踰덈��꽣 5踰� �궗�씠�쓽 踰덊샇留� �꽔�쑝�꽭�슂!");
				if (input.hasNext()) {
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
		ArrayList<Input> classes = new ArrayList<Input>();
		System.out.println("# of registered Innerclasses:" + classes.size());
		for (int i = 0; i < classes.size(); i++) {
			classes.get(i).printInfo();
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

	public static MenuManager getObject(String filename) {
		MenuManager MenuManager = null;
		FileInputStream file;

		try {
			file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);

			MenuManager = (MenuManager) obj.readObject();

			obj.close();
			file.close();

		} catch (FileNotFoundException e) {
			return MenuManager;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return MenuManager;
	}

	public static void putObject(MenuManager menumanager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(menumanager);

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


	public Input get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addClass(Input innerclass) {
		// TODO Auto-generated method stub
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
