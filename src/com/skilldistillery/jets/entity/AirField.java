package com.skilldistillery.jets.entity;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	// Fields
	private List<Jet> jets;
	private int numJets = 0;

	// Constructors
	public AirField() {
	}

	public AirField(List<Jet> jets) {
		this.jets = jets;
		numJets = jets.size();
	}

	// methods
	public void addJets(Jet jet) { 
		this.jets.add(jet);
	}

	public List<Jet> getJetsList() {
		List<Jet> jetsListCopy = new ArrayList<Jet>();
		jetsListCopy.addAll(jets);
		
//		for (int i = 0; i < jets.size() ; i++) {
//			System.out.println(numJets);
//			System.out.println(jets.get(i));
//			jetsListCopy.add(jets.get(i)); //makes a copy of each index and adds it to the copied array
//		}
		return jetsListCopy;
	}

}
