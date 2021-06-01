package com.skilldistillery.jets.entity;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FighterJet(String model, int speed, int range, double price) {
		super(model,speed,range,price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dogFight() {
		this.fly();
		System.out.println("Checking ammunitions");
		System.out.println("Locking on...");
		System.out.println("Pew Pew!");
		
	}

}
