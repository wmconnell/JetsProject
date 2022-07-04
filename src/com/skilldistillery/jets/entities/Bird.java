package com.skilldistillery.jets.entities;

abstract class Bird { // Jet

	private String species;
	private int speed;
	private int range;
	private int price;

	public Bird() {

	}

	public Bird(String species, int speed, int range, int price) {
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
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
		System.out.println("The " + this.getClass().getSimpleName() + " has a speed of " + this.speed + ", a range of "
				+ this.range + ",and a price of " + this.price + ". It can fly for " + (this.range / this.speed)
				+ " before it requires refeeding.");
	}

}
