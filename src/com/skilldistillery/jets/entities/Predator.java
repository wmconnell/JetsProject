package com.skilldistillery.jets.entities;

public class Predator extends Bird implements CombatReady{ //FighterJet

	public Predator() {
		super();
	}

	public Predator(String species, int speed, int range, int price) {
		super(species, speed, range, price);
	}

	@Override
	public String toString() {
		return "Species: " + getSpecies() + ", speed: " + getSpeed() + ", range: "
				+ getRange() + ", price:" + getPrice() + "\n";
	} 

	
	

	
	
}
