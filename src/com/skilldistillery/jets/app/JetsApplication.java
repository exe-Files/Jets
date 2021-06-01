package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
// cmd+shift+O saves lives :)

import com.skilldistillery.jets.entity.AirField;
import com.skilldistillery.jets.entity.CargoJet;
import com.skilldistillery.jets.entity.FighterJet;
import com.skilldistillery.jets.entity.Jet;
import com.skilldistillery.jets.entity.JetImpl;
import com.skilldistillery.jets.entity.OtherJet;
import com.skilldistillery.jets.entity.PassengerJet;

public class JetsApplication {
	Scanner scanner = new Scanner(System.in);
	private AirField airField;
	public boolean debugMode = true;

	// main
	public static void main(String[] args) {
		// List<Set<String>> c = new ArrayList<>();
		JetsApplication jetApp = new JetsApplication();
		// launches the body of the program
		jetApp.launch();

	}

	private void launch() {
		List<String> jetsStringList = readInFile();
		airField = new AirField(parseJetObjFromString(jetsStringList));
		System.out.println("***************");
		displayUserMenu();
		System.out.println("***************");

	}

	private List<String> readInFile() { // returns an arrayList of Strings
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
			System.out.println("\nall lines from file added \n");
		}
		return jetsList;
	}

	private List<Jet> parseJetObjFromString(List<String> jetsStringList) {
		String[] jetStringArray = new String[jetsStringList.size()]; // generates a string array the size of the list
		jetStringArray = (String[]) jetsStringList.toArray(jetStringArray); // adds list to the array
		ArrayList<Jet> parsedJetList = new ArrayList<Jet>(); //
		for (String jet : jetStringArray) {
			String[] jetStats = jet.split(",");
			Jet jetObj = jetObjCreation(jetStats);
			parsedJetList.add(jetObj);
		}
		return parsedJetList;

	}

	private Jet jetObjCreation(String[] jetStats) {
		Jet jetObj = null;
		if (jetStats[4].equalsIgnoreCase("Passenger")) {
			jetObj = new PassengerJet(jetStats[0], Integer.parseInt(jetStats[1]), Integer.parseInt(jetStats[2]),
					Double.parseDouble(jetStats[3]));
			return jetObj;
		}
		if (jetStats[4].equalsIgnoreCase("Fighter")) {
			jetObj = new FighterJet(jetStats[0], Integer.parseInt(jetStats[1]), Integer.parseInt(jetStats[2]),
					Double.parseDouble(jetStats[3]));
			return jetObj;
		}
		if (jetStats[4].equalsIgnoreCase("Cargo")) {
			jetObj = new CargoJet(jetStats[0], Integer.parseInt(jetStats[1]), Integer.parseInt(jetStats[2]),
					Double.parseDouble(jetStats[3]));
			return jetObj;
		} else {

			try {
				jetObj = new OtherJet(jetStats[0], Integer.parseInt(jetStats[1]), Integer.parseInt(jetStats[2]),
						Double.parseDouble(jetStats[3]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return jetObj;

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
			System.out.println("***************");
			userInput = (userInputValidate());
			userChoice(userInput);
			System.out.println();
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
				scanner.nextLine(); // Clears the input buffer
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
		List<Jet> jetList = airField.getJetsList();
		for (Jet jet : jetList) {
			System.out.println(jet.toString());
		}

	}

	// #2
	private void flyAllJets() {
		System.out.println("Flying all jets...");
		System.out.println(airField.getJetsList());
		List<Jet> jetList = airField.getJetsList();
		for (Jet jet : jetList) {
			jet.fly();
		}

	}

	// #3
	private void fastestJet() {
		System.out.println("Loading the fastest jet...");
		List<Jet> jetList = airField.getJetsList();
		Jet fastestJet = jetList.get(0);
		for (int i = 0; i < jetList.size(); i++) {
			if (fastestJet.getSpeed() < jetList.get(i).getSpeed()) {
				fastestJet = jetList.get(i);
			}

		}
		System.out.println(fastestJet);

	}

	// # 4
	private void jetWithLongestRange() {
		System.out.println("Loading Jet with the longest range...");
		List<Jet> jetList = airField.getJetsList();
		Jet longestRangeJet = jetList.get(0);
		for (int i = 0; i < jetList.size(); i++) {
			if (longestRangeJet.getRange() < jetList.get(i).getRange()) {
				longestRangeJet = jetList.get(i);
			}

		}
		System.out.println(longestRangeJet);

	}

	// #5
	private void loadAllCargoJets() {
		System.out.println("Loading all Cargo Jets...");
		List<Jet> jetList = airField.getJetsList();
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i) instanceof CargoJet) {
				((CargoJet) jetList.get(i)).loadCargo();
			}
		}
	}

	// #6
	private void dogFight() {
		System.out.println("Dog Fight Initiated...");
		List<Jet> jetList = airField.getJetsList();
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i) instanceof FighterJet) {
				((FighterJet) jetList.get(i)).dogFight();
			}
		}

	}

	// #7
	private void addAJet() {
		System.out.println("Adding a Jet...");
		System.out.println("What is the model you would like to add? ");
		scanner.nextLine(); //clears the scanner buffer 
		String modelName = scanner.nextLine();
		System.out.println("What is the speed of the jet?");
		int speed = scanner.nextInt();
		System.out.println("What is the max range (in miles) that the jet can travel without stopping?");
		int range = scanner.nextInt();
		System.out.println("What is the price?");
		double price = scanner.nextDouble();
		JetImpl newJet = new JetImpl(modelName, speed, range, price);
		System.out.println(modelName + " created!");
		airField.addJet(newJet);
		System.out.println(modelName + " added to the air field!");

	}

	// #8
	private void removeJet() {
		System.out.println("Removing a Jet...");
		List<Jet> jetList = airField.getJetsList();
		int userInput = 0;
		int counter = 1;
		boolean noneRemoved = true;
		for (Jet jet : jetList) {
			System.out.println(counter + ") " + jet.getModel());
			counter++;
		}
		System.out.println("Please select which jet you would like to remove: ");
		while (noneRemoved) {
			try {
				System.out.println(); //reinitializes userInput per loop
				userInput = scanner.nextInt();
				if (userInput > 0 || userInput < jetList.size()) {
					airField.removeJet(userInput - 1);
					noneRemoved = false;
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Invalid input, try again");
				scanner.nextLine(); // Clears the input buffer
			}
			System.out.println("Successfully removed!");
		}

	}

}
