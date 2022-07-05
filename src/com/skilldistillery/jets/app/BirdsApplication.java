package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Aviary;
import com.skilldistillery.jets.entities.Carrier;
import com.skilldistillery.jets.entities.Domesticated;
import com.skilldistillery.jets.entities.Predator;

public class BirdsApplication {

//	private List<Bird> flock2; 

	public static void main(String[] args) {
		BirdsApplication birdApp = new BirdsApplication();

		Aviary aviary = new Aviary();
		Scanner scanner = new Scanner(System.in);
		aviary.run(scanner, "jets.txt");
		
		birdApp.menu(scanner);
	}

//	public void run(Scanner scanner) {
//		List<Bird> listOfBirds = new ArrayList<>();
//		
//		for (int i = 0; i < 6; i++) {
//			listOfBirds.add(new String());
//		}
//		BufferedReader bufIn = null;
//		try {
//			bufIn = new BufferedReader(new FileReader("jets.csv"));
//			String line;
//			while ((line = bufIn.readLine()) != null) {
////				System.out.println(line);
//				listOfBirds.add(line);
//			}
//		} catch (IOException e) {
//			System.err.println(e);
//		} finally {
//			if (bufIn != null) {
//				try {
//					bufIn.close();
//				} catch (IOException e) {
//					System.err.println(e);
//				}
//			}
//		}
//		
//		Aviary(listOfBirds);
//	}

	public void menu(Scanner scanner) {
//		Domesticated domesticated = new Domesticated();
//		Predator predator = new Predator();
//		Carrier carrier = new Carrier();

		System.out.println("Please make a selection from the list below:");
		System.out.println("");
		System.out.println("1. List flock");
		System.out.println("2. Fly all birds");
		System.out.println("3. View fastest bird");
		System.out.println("4. View bird with longest range");
		System.out.println("5. Load all carrier birds");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a bird to the flock");
		System.out.println("8. Remove a bird from the flock");
		System.out.println("9. Quit");
		String input = scanner.nextLine();
		switch (input) {
		case "1":
			System.out.println();
		case "2":
			System.out.println("Flying all birds!");
//			domesticated.fly();
//			carrier.fly();
//			predator.fly();
		case "3":
			System.out.println();
		case "4":
			System.out.println();
		case "5":
			System.out.println();
		case "6":
			System.out.println();
		case "7":
			System.out.println();
		case "8":
			System.out.println();
		case "9":
			System.out.println();
		default:
			System.out.println("Please enter a valid option.");
		}

	}

}
