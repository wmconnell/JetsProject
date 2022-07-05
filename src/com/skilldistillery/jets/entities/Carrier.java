package com.skilldistillery.jets.entities;

public class Carrier extends Bird implements MessageAndBabyCarrier { // CargoPlane

	public Carrier() {
		super();
	}

	public Carrier(String species, double speed, int range, int price) {
		super(species, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Species: " + getSpecies() + ", Speed: " + getSpeed() + " mph, Range: "
				+ getRange() + " miles, Price: $" + getPrice() + "\n";
	}

	@Override
	public void loadMessagesAndBabies() {
		System.out.println("Carrier birds! Grab as many messages as you can, and deliver your payloads!");
	} 

}
