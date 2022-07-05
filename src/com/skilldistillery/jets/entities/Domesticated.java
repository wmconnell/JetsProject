package com.skilldistillery.jets.entities;

public class Domesticated extends Bird { //JetImpl

	public Domesticated() {
		super();
	}

	public Domesticated(String species, double speed, int range, int price) {
		super(species, speed, range, price);
		
		
	}

	@Override
	public String toString() {
		return "Species: " + getSpecies() + ", Speed: " + getSpeed() + " mph, Range: "
				+ getRange() + " miles, Price: $" + getPrice() + "\n";
	} 

	
}
