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
//			1. List fleet
			listAllJets();
			break;
		case 2:
//			2. Fly all jets
			flyAllJets();
			break;
		case 3:
//			3. View fastest jet
			fastestJet();
			break;
		case 4:
//			4. View jet with longest range
			jetWithLongestRange();
			break;
		case 5:
//			5. *Load all Cargo Jets*
			loadAllCargoJets();
			break;
		case 6:
//			6. *Dogfight!*
			dogFight();
			break;
		case 7:
//			7. Add a jet to Fleet
			addAJet();
			break;
		case 8:
//			8. Remove a jet from Fleet
			removeJet();
			break;
		case 9:
//			9. Quit
			System.out.println("Thank you for your support!");
			break;
		default:
			System.out.println("Invalid input, please select something else.");
			break;
		}

	}

	// #1
	private void listAllJets() {
		System.out.println("Listing all jets...");
		// TODO Auto-generated method stub
		
	}
	
	// #2
	private void flyAllJets() {
		System.out.println("Flying all jets...");
		// TODO Auto-generated method stub
		
	}
	// #3
	private void fastestJet() {
		System.out.println("Loading the fastest jet...");
		// TODO Auto-generated method stub
		
	}
	
	// # 4
	private void jetWithLongestRange() {
		System.out.println("Loading Jet with the longest range...");
		// TODO Auto-generated method stub
		
	}
	
	// #5
	private void loadAllCargoJets() {
		System.out.println("Loading all Cargo Jets...");
		// TODO Auto-generated method stub
		
	}
	// #6
	private void dogFight() {
		System.out.println("DOG FIGHT...");
		// TODO Auto-generated method stub
		
	}
	
	
	// #7
	private void addAJet() {
		System.out.println("Adding a Jet...");
		// TODO Auto-generated method stub
		
	}
	
	// #8
	private void removeJet() {
		// TODO Auto-generated method stub
		System.out.println("Removing a Jet...");
	}






}
