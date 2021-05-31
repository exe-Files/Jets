package com.skilldistillery.jets.entity;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	// Fields
	private List<Jet> listOfJets;
	private int numJets = 0;

	// Constructors
	public AirField() {
	}

	public AirField(List<Jet> listOfJets) {
		this.listOfJets = listOfJets;
		numJets = listOfJets.size();
	}

	// methods
	public void addJet(Jet jet) { 
		this.listOfJets.add(jet);
	}
	public void removeJet(int jetIndex) { 
		this.listOfJets.remove(jetIndex);
	}

	public List<Jet> getJetsList() {
		List<Jet> listOfJetsCopy = new ArrayList<Jet>();
		listOfJetsCopy.addAll(listOfJets);
		
//		for (int i = 0; i < jets.size() ; i++) {
//			System.out.println(numJets);
//			System.out.println(jets.get(i));
//			jetsListCopy.add(jets.get(i)); //makes a copy of each index and adds it to the copied array
//		}
		return listOfJetsCopy;
	}

}
