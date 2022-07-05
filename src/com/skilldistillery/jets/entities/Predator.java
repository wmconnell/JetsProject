package com.skilldistillery.jets.entities;

public class Predator extends Bird implements CombatReady{ //FighterJet

	public Predator() {
		super();
	}

	public Predator(String species, double speed, int range, int price) {
		super(species, speed, range, price);
	}

	@Override
	public String toString() {
		return "Species: " + getSpecies() + ", Speed: " + getSpeed() + " mph, Range: "
				+ getRange() + " miles, Price: $" + getPrice() + "\n";
	}

	public void fight() {
		System.out.println("Predatory birds! Ensure your talons and beaks are sharpened, and fight your enemy!!");
	} 

	
	

	
	
}
