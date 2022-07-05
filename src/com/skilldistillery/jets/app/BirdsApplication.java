package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Aviary;
import com.skilldistillery.jets.entities.Bird;
import com.skilldistillery.jets.entities.Carrier;
import com.skilldistillery.jets.entities.Domesticated;
import com.skilldistillery.jets.entities.Predator;

public class BirdsApplication { //JetsApplication

	private Aviary aviary = new Aviary();

	public static void main(String[] args) {
		BirdsApplication birdApp = new BirdsApplication();

		Scanner scanner = new Scanner(System.in);
		birdApp.aviary.run(scanner, "jets.txt");

		birdApp.menu(scanner);
		scanner.close();
	}

	public void menu(Scanner scanner) {
		Carrier carrier = new Carrier();
		Predator predator = new Predator();

		boolean isGoing = true;
		while (isGoing) {
			System.out.println("Please make a selection from the list below:");
			System.out.println("");
			System.out.println("1. List flock");
			System.out.println("2. Fly all birds");
			System.out.println("3. View fastest bird");
			System.out.println("4. View bird with longest range");
			System.out.println("5. Load all carrier birds");
			System.out.println("6. Fight!");
			System.out.println("7. Add a bird to the flock");
			System.out.println("8. Remove a bird from the flock");
			System.out.println("9. Quit");
			String input = scanner.nextLine();

			switch (input) {
			case "1":
				for (int i = 0; i < aviary.getFlock().size(); i++) {

					if (aviary.getFlock().get(i) instanceof Domesticated) {
						System.out.println(((Domesticated) aviary.getFlock().get(i)).toString());

					} else if (aviary.getFlock().get(i) instanceof Predator) {
						System.out.println(((Predator) aviary.getFlock().get(i)).toString());

					} else if (aviary.getFlock().get(i) instanceof Carrier) {
						System.out.println(((Carrier) aviary.getFlock().get(i)).toString());

					}

				}
				break;
			case "2":
				System.out.println("Flying all birds!");
				for (int i = 0; i < aviary.getFlock().size(); i++) {
					aviary.getFlock().get(i).fly();
				}
				break;
			case "3":
				System.out.println("The fastest bird is the: ");
				List<Bird> sortedFlock = new ArrayList<>();
				sortedFlock.add(new Domesticated("fastBird", 0.0, 0, 0));
				int flockSize;
				for (int i = 0; i < aviary.getFlock().size(); i++) {
					flockSize = sortedFlock.size();
					for (int j = 0; j < flockSize; j++) {
						if (j > 0 && j == flockSize - 1) {
							sortedFlock.add(j, aviary.getFlock().get(i));
						} else if (aviary.getFlock().get(i).getSpeed() > sortedFlock.get(j).getSpeed()) {
							sortedFlock.add(j, aviary.getFlock().get(i));
							break;
						}

					}

				}
				sortedFlock.remove(sortedFlock.size() - 1);
				System.out.println(sortedFlock.get(0));
				break;
			case "4":
				System.out.println("The bird with the longest range is the: ");
				List<Bird> sortedFlock2 = new ArrayList<>();
				sortedFlock2.add(new Domesticated("fastBird", 0.0, 0, 0));
				int flockSize2;
				for (int i = 0; i < aviary.getFlock().size(); i++) {
					flockSize = sortedFlock2.size();
					for (int j = 0; j < flockSize; j++) {
						if (j > 0 && j == flockSize - 1) {
							sortedFlock2.add(j, aviary.getFlock().get(i));
						} else if (aviary.getFlock().get(i).getRange() > sortedFlock2.get(j).getRange()) {
							sortedFlock2.add(j, aviary.getFlock().get(i));
							break;
						}

					}

				}
				sortedFlock2.remove(sortedFlock2.size() - 1);
				System.out.println(sortedFlock2.get(0));
				break;
			case "5":
				carrier.loadMessagesAndBabies();
				break;
			case "6":
				predator.fight();
				break;
			case "7":
				aviary.birdAddingMenu(scanner);
				break;
			case "8":
				birdRemovalMenu(scanner);
				break;
			case "9":
				System.out.println("Please come back soon!");
				isGoing = false;
				break;
			default:
				System.out.println("Please enter a valid option.");
			}
		}

	}

	public void birdRemovalMenu(Scanner scanner) {
		System.out.println("Please select the number of the bird you would like to remove: ");
		for (int i = 0; i < aviary.getFlock().size(); i++) {
			System.out.println((i + 1) + ". " + aviary.getFlock().get(i).toString());
		}
		int birdChoice = scanner.nextInt();
		scanner.nextLine();
		aviary.getFlock().remove(birdChoice - 1);

		System.out.println("Your bird of choice has been removed from the aviary");
	}
}
