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
	
	public void run(Scanner scanner, String fileName) {
		List<String> listOfBirds = new ArrayList<>();
		
//		for (int i = 0; i < 6; i++) {
//			listOfBirds.add();
//		}
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader(fileName));
			String line;
			Domesticated domesticBird = new Domesticated();
			Predator predatoryBird = new Predator();
			Carrier carrierBird = new Carrier();
			
			while ((line = bufIn.readLine()) != null) {
//				System.out.println(line);
				String[] birdInfo = line.split(","); 
				listOfBirds.add(line);
//				System.out.println(birdInfo[0]);
//				System.out.println(birdInfo[1]);
//				System.out.println(birdInfo[2]);
//				System.out.println(birdInfo[3]);
//				System.out.println(birdInfo[4]);
				
				if (birdInfo[0].equals("domesticated")) {
					domesticBird = new Domesticated(birdInfo[1], Integer.parseInt(birdInfo[2]), Integer.parseInt(birdInfo[3]), Integer.parseInt(birdInfo[4]));
					flock.add(domesticBird);
				} 
				else if (birdInfo[0].equals("predator")) {
					predatoryBird = new Predator(birdInfo[1], Integer.parseInt(birdInfo[2]), Integer.parseInt(birdInfo[3]), Integer.parseInt(birdInfo[4]));
					
					flock.add(predatoryBird);
				}
				else if (birdInfo[0].equals("carrier")) {
					carrierBird = new Carrier(birdInfo[1], Integer.parseInt(birdInfo[2]), Integer.parseInt(birdInfo[3]), Integer.parseInt(birdInfo[4]));
					flock.add(carrierBird);
					
				}
				
//				System.out.println(domesticBird.toString());
//				System.out.println(predatoryBird.toString());
//				System.out.println(carrierBird.toString());
				
			}
			System.out.println(flock);
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
		
//		if 
		
	}

}
