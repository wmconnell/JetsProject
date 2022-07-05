package com.skilldistillery.jets.entities;

public class Domesticated extends Bird { //JetImpl

	public Domesticated() {
		super();
	}

	public Domesticated(String species, int speed, int range, int price) {
		super(species, speed, range, price);
		
		
	}

	@Override
	public String toString() {
		return "Species: " + getSpecies() + ", speed: " + getSpeed() + ", range: "
				+ getRange() + ", price:" + getPrice() + "\n";
	} 

	
}
