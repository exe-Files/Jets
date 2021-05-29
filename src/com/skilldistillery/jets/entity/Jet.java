package com.skilldistillery.jets.entity;

public abstract class Jet {
	//Fields
	private String model;
	private int speed;
	private int range;
	private double price;
	
	//Constructors	
	public Jet(String model) {
		super();
		this.model = model;
	}

	public Jet(String model, int speed, int range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	
	//Methods
	public void fly() {
		String jetData = this.toString();
		System.out.println(jetData);
	}

	@Override
	public String toString() {
		return "Jet model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price ;
	}

	
	
}
