package com.skilldistillery.jets.entities;

public class Carrier extends Bird implements MessageAndBabyCarrier { // CargoPlane

	public Carrier() {
		super();
	}

	public Carrier(String species, int speed, int range, int price) {
		super(species, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Species: " + getSpecies() + ", speed: " + getSpeed() + ", range: "
				+ getRange() + ", price:" + getPrice() + "\n";
	} 

}
