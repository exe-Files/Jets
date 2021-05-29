package com.skilldistillery.jets.entity;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	// Fields
	private List<Jet[]> jets;
	{jets = new ArrayList<Jet[]>();}
	private int numJets = 0;

	// Constructors
	public AirField() {
		numJets++;
	}

	public AirField(List<Jet[]> jets) {
		this.jets = jets;
		numJets++;
	}

	// methods
	public void addJets(Jet[] jet) { //should add a jet array to the jets list
		this.jets.add(jet);
	}

	public List<Jet[]> getJetsList() {
		List<Jet[]> jetsListCopy;
		jetsListCopy = new ArrayList<Jet[]>();
		for (int i = 0; i < jets.size() ; i++) {
			jetsListCopy.add(jets.get(i)); //makes a copy of each index
		}
		return jetsListCopy;
	}

}
