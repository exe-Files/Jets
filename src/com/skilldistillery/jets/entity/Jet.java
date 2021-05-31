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

	
	public Jet() {
	}

	//Methods
	public void fly() {
		String jetData = this.toString();
		System.out.println(jetData);
	}

	@Override
	public String toString() {
		return "Jet model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price=" + getPrice() ;
	}

	private String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	private int getSpeed() {
		return speed;
	}

	private void setSpeed(int speed) {
		this.speed = speed;
	}

	private int getRange() {
		return range;
	}

	private void setRange(int range) {
		this.range = range;
	}

	private double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}

	
	
}
