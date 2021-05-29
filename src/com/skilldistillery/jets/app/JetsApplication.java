package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entity.AirField;

public class JetsApplication {
	private AirField airField; // cmd+shift+O saves lives
	Scanner scanner = new Scanner(System.in);
	private boolean debugMode = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Set<String>> c = new ArrayList<>();
		JetsApplication jetApp = new JetsApplication();
		jetApp.launch();

	}

	private void launch() {
		List jetsList = readInFile();
		System.out.println("***************");
		displayUserMenu();
		System.out.println("***************");

	}

	private List readInFile() { // returns an arrayList of strings
		ArrayList<String> jetsList = new ArrayList<String>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				jetsList.add(line);
				if (debugMode) {
					System.out.println(line + " added");
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		if (debugMode) {
			System.out.println("all lines added");
		}
		return jetsList;
	}

	private void displayUserMenu() {
		int userInput = 0;
		while (userInput != 9) {

			System.out.println("Please select an option from the menu: ");
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
			userChoice(userInput);
		}
	}

	private int userInputValidate() {
		// try catch
		int userInput = 0;
		while (userInput < 1 || userInput > 9) {
			try {
				System.out.println();
				userInput = scanner.nextInt();
				if (userInput > 0 || userInput < 10) {
					return userInput;
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Invalid input, please enter 1 - 9");
				scanner.nextLine(); //Clears the input buffer
			}
		}

		return userInput;
	}

	private void userChoice(int userInput) {
		// TODO Auto-generated method stub
		switch (userInput) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		default:

		}

	}

}
