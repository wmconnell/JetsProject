package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aviary { // Airfield

	private List<Bird> flock;

	public Aviary() {

	}

	public Aviary(List<Bird> flock) {
		this.flock = flock;
	}
	
	public void run(Scanner scanner, String fileName) {
		List<String> listOfBirds = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			listOfBirds.add(new String());
		}
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = bufIn.readLine()) != null) {
				System.out.println(line);
				listOfBirds.add(line);
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
		
	}

}
