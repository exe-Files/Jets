package com.skilldistillery.jets.entity;

public abstract class Jet {
	//Fields
	private String model;
	private int speed;
	private int range;
	private double time;
	private double price;
	
	//Constructors	
	public Jet() {
	}

	public Jet(String model) {
		this.model = model;
	}

	public Jet(String model, int speed, int range, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.setTime((double)range / (double)speed);
	}

	//Methods
	public String toString() {
		return getModel().substring(0,1).toUpperCase() 
				+ getModel().substring(1) + ", Speed = " 
				+ getSpeed() + "mph, Range = " 
				+ getRange() + "mi, Price = $" 
				+ getPrice() ;
	}
	public void fly() {
		System.out.println(this.getModel() + " taking off...");
		String jetData = "Speed = " + this.getSpeed() 
						+"mph, Range = "+ getRange() 
						+"mi, Time = " + getTime()
						+"hrs";
		System.out.println(jetData);
	}

	
	//Getters & Setters
	public String getModel() {
		return model; 
	}

	private void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	private void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
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

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	
	
}
