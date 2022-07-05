package com.skilldistillery.jets.entities;

public abstract class Bird { // Jet

	private String species;
	private double speed;
	private int range;
	private int price;

	public Bird() {

	}

	public Bird(String species, double speed, int range, int price) {
		this.species = species;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void fly() {
		System.out.println("The " + species + " has a speed of " + this.speed + " mph, a range of "
				+ this.range + " miles, and a price of " + this.price + " dollars. It can fly for " + ((double)(this.range) / (double)(this.speed))
				+ " hours before it requires refeeding.");
	}

}
