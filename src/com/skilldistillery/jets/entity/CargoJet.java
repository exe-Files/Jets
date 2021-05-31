package com.skilldistillery.jets.entity;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet() {
	}

	public CargoJet(String model, int speed, int range, double price) {
		super(model,speed,range,price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println("Loading up the cargo before flight!");

	}

	@Override
	public void loadCargo(int amount) {
		// TODO Auto-generated method stub
		
	}

}
