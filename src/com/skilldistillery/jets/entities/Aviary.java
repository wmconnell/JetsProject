package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aviary { // Airfield

	private List<Bird> flock = new ArrayList<>();

	public Aviary() {

	}

	public Aviary(List<Bird> flock) {
		this.flock = flock;
	}

	public List<Bird> getFlock() {
		return flock;
	}

	public void setFlock(List<Bird> flock) {
		this.flock = flock;
	}

	public void run(Scanner scanner, String fileName) {
		List<String> listOfBirds = new ArrayList<>();

		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader(fileName));
			String line;
			Domesticated domesticBird = new Domesticated();
			Predator predatoryBird = new Predator();
			Carrier carrierBird = new Carrier();

			while ((line = bufIn.readLine()) != null) {
//				System.out.println(line);			//testing
				String[] birdInfo = line.split(",");
//				listOfBirds.add(line);  			//testing
//				System.out.println(birdInfo[0]);	//testing
//				System.out.println(birdInfo[1]);	//testing
//				System.out.println(birdInfo[2]);	//testing
//				System.out.println(birdInfo[3]);	//testing
//				System.out.println(birdInfo[4]);	//testing

				if (birdInfo[0].equals("domesticated")) {
					domesticBird = new Domesticated(birdInfo[1], Integer.parseInt(birdInfo[2]),
							Integer.parseInt(birdInfo[3]), Integer.parseInt(birdInfo[4]));
					flock.add(domesticBird);
				} else if (birdInfo[0].equals("predator")) {
					predatoryBird = new Predator(birdInfo[1], Integer.parseInt(birdInfo[2]),
							Integer.parseInt(birdInfo[3]), Integer.parseInt(birdInfo[4]));

					flock.add(predatoryBird);
				} else if (birdInfo[0].equals("carrier")) {
					carrierBird = new Carrier(birdInfo[1], Integer.parseInt(birdInfo[2]), Integer.parseInt(birdInfo[3]),
							Integer.parseInt(birdInfo[4]));
					flock.add(carrierBird);

				}

			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}

//		System.out.println(flock);  //testing
		
	}
	
	public void birdAddingMenu(Scanner scanner) {
		Domesticated inputBird = new Domesticated();
		
		System.out.println("Please enter the species of bird: ");
		String inputSpecies = scanner.nextLine();
		System.out.println("Please enter the flight speed of the bird: ");
		double inputSpeed = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Please enter the range of the bird: ");
		int inputRange = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the price of the bird: ");
		int inputPrice = scanner.nextInt();
		scanner.nextLine();
		inputBird = new Domesticated(inputSpecies, inputSpeed, inputRange, inputPrice);
		flock.add(inputBird);
	}

}
