package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter pets = new VirtualPetShelter();

		System.out.println("Thank you for volunteering at Cooksey's Pet Shelter");
		System.out.println();
		System.out.println("There are currently no pets in the shelter.");
		System.out.println("Would you like to admit a pet? (y/n)");
		String answer = input.nextLine();
		while (!(answer.toLowerCase().equals("y") || answer.toLowerCase().equals("n"))) {
			System.out.println("Please enter \"y\" or \"n\"");
			answer = input.nextLine();
		}

		if (answer.toLowerCase().equals("n")) {
			System.out.println("You decided to go home.");
			System.exit(0);
		}

		while (answer.toLowerCase().equals("y")) {
			System.out.println("Thank you for admitting a pet.");
			System.out.println("Please give your pet a name: ");
			String petName = input.nextLine();
			System.out.println("Please give your pet a short description: ");
			String petDescription = input.nextLine();
			pets.admitPet(new VirtualPet(petName, petDescription));

			System.out.println("Thank you for admitting " + petName);
			System.out.println("Would you like to admit another pet? (y/n)");
			answer = input.nextLine();
			while (!((answer.toLowerCase().equals("y")) || (answer.toLowerCase().equals("n")))) {
				System.out.println("Invalid response. Please try again.");
				answer = input.nextLine();
			}
		}

		System.out.println("Here are your pets' current vitals: ");

		answer = "";
		while (!(answer.equals("7"))) {

			System.out.println();
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
			System.out.println("--------|-------|-------|-------");
			for (VirtualPet pet : pets.petList()) {
				System.out.println(pet.toString());
			}
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("1. Feed the pets");
			System.out.println("2. Water the pets");
			System.out.println("3. Play with all of the pets");
			System.out.println("4. Play with a pet");
			System.out.println("5. Adopt a pet");
			System.out.println("6. Admit a pet");
			System.out.println("7. Go home");

			answer = input.nextLine();

			if (answer.equals("1")) {
				System.out.println("You fed the pets!");
				pets.feedAllPets();
			} else if (answer.equals("2")) {
				System.out.println("You watered the pets!");
				pets.waterAllPets();
			} else if (answer.equals("3")) {
				System.out.println("You played with all of the pets!");
				System.out.println("The pets love you!");
				pets.playWithAllPets();
			} else if (answer.equals("4")) {
				System.out.println("What is the name of the pet you would like to play with?");
				for (VirtualPet pet : pets.petList()) {
					System.out.println("[" + pet.getName() + "]" + " " + pet.petDescription());
				}
				String petName = input.nextLine();
				System.out.println("You decided to play with " + petName);
				System.out.println(petName + " is much happier now.");
				pets.playWithOnePet(petName);
			} else if (answer.equals("5")) {
				System.out.println("Which pet would you like to adopt?");
				String petName = input.nextLine();
				if (pets.petList().contains(petName)) {
					pets.adoptPet(petName);
				} else {
					System.out.println("Sorry, that pet has not been admitted to the shelter.");
					System.out.println("Please try again");
				}
			} else if (answer.equals("6")) {
				System.out.println("Thank you for admitting another pet.");
				System.out.println("Please input the pet's name: ");
				String petName = input.nextLine();
				System.out.println("Please give your pet a short description: ");
				String petDescription = input.nextLine();
				pets.admitPet(new VirtualPet(petName, petDescription));
			} else if (!answer.equals("7")) {
				System.out.println("You are waiting too long.");
				System.out.println("Please do something:");
			}

			pets.tickAllPets();
		}

		System.out.println("You are done for the day.");
		input.close();
		System.exit(0);
	}

}