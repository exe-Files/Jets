package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.skilldistillery.jets.entity.AirField;

public class JetsApplication {
	private AirField airField; // cmd+shift+O saves lives
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Set<String>> c = new ArrayList<>();
		JetsApplication jetApp = new JetsApplication();
		jetApp.launch();

	}

	private void launch() {
		readInFile();
		displayUserMenu();

	}

	private void readInFile() {
		// You can use this in your code again and again
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	private void displayUserMenu() {
		System.out.println("Please select an option from the menu: ");
		int userInput = 0;
		while(userInput != 9){
			
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a jet from Fleet");
			System.out.println("9. Quit");
			userInput = (userInputValidate());
		}	
	}

	private int userInputValidate() {
		//try catch
		int userInput = 0;
		try {
			userInput = scanner.nextInt();
			if(userInput > 0 || userInput < 10) {
				return userInput;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return userInput;
	}
}
