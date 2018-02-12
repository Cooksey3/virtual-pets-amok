package virtualpetsamok;

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
			System.out.println("What kind of pet is " + petName + "?");
			System.out.println("Enter a number:");
			System.out.println("1. Organic Dog");
			System.out.println("2. Organic Cat");
			System.out.println("3. Robot Dog");
			System.out.println("4. Robot Cat");
			String typeOfPet = input.nextLine();
			if (typeOfPet.equals("1")) {
				Dog pet = new Dog(petName, petDescription);
				pets.admitPet(pet);
			} else if (typeOfPet.equals("2")) {
				Cat pet = new Cat(petName, petDescription);
				pets.admitPet(pet);
			} else if (typeOfPet.equals("3")) {
				RobotDog pet = new RobotDog(petName, petDescription);
				pets.admitPet(pet);
			} else if (typeOfPet.equals("4")) {
				RobotCat pet = new RobotCat(petName, petDescription);
				pets.admitPet(pet);
			} else {
				System.out.println("Invalid input.");
				System.out.println("Please try again.");
			}

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
		while (!(answer.equals("0"))) {

			System.out.println();
			System.out.println("Name\t|Hunger\t|Thirst\t|Oil\t|Boredom|Health\t|Happy\t|Waste\t|Cage\t|");
			System.out.println("--------|-------|-------|-------|-------|-------|-------|-------|-------|");
			for (VirtualPet pet : pets.petList()) {
				System.out.println(pet.toString());
			}
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("1. Feed the organic pets");
			System.out.println("2. Water the organic pets");
			System.out.println("3. Oil robotic pets");
			System.out.println("4. Play with all of the pets");
			System.out.println("5. Play with a pet");
			System.out.println("6. Walk the dogs");
			System.out.println("7. Adopt a pet");
			System.out.println("8. Admit a pet");
			System.out.println("9. Clean dog cages");
			System.out.println("10. Empty litter box");
			System.out.println("0. Go home");
			answer = input.nextLine();

			if (answer.equals("1")) {
				System.out.println("You fed the organic pets!");
				pets.feedAllOrganicPets();
			} else if (answer.equals("2")) {
				System.out.println("You watered the organic pets!");
				pets.waterAllOrganicPets();
			} else if (answer.equals("3")) {
				System.out.println("You oiled the robot pets!");
				pets.oilAllRobots();
			} else if (answer.equals("4")) {
				System.out.println("You played with all of the pets!");
				System.out.println("The pets love you!");
				pets.playWithAllPets();
			} else if (answer.equals("5")) {
				System.out.println("What is the name of the pet you would like to play with?");
				for (VirtualPet pet : pets.petList()) {
					System.out.println("[" + pet.getName() + "]" + " " + pet.petDescription());
				}
				String petName = input.nextLine();
				System.out.println("You decided to play with " + petName);
				System.out.println(petName + " is much happier now.");
				pets.playWithOnePet(petName);
			} else if (answer.equals("6")) {
				System.out.println("You walked the dogs!");
				System.out.println("The dogs love you!");
				pets.walkAllDogs();
			} else if (answer.equals("7")) {
				System.out.println("Which pet would you like to adopt?");
				String petName = input.nextLine();
				if (pets.findPet(petName) != null) {
					pets.adoptPet(petName);
				} else {
					System.out.println("Sorry, that pet has not been admitted to the shelter.");
					System.out.println("Please try again");
				}
			} else if (answer.equals("8")) {
				System.out.println("Thank you for admitting another pet.");
				System.out.println("Please give your pet a name: ");
				String petName = input.nextLine();
				System.out.println("Please give your pet a short description: ");
				String petDescription = input.nextLine();
				System.out.println("What kind of pet is " + petName + "?");
				System.out.println("Enter a number:");
				System.out.println("1. Organic Dog");
				System.out.println("2. Organic Cat");
				System.out.println("3. Robot Dog");
				System.out.println("4. Robot Cat");
				String typeOfPet = input.nextLine();
				if (typeOfPet.equals("1")) {
					Dog pet = new Dog(petName, petDescription);
					pets.admitPet(pet);
				} else if (typeOfPet.equals("2")) {
					Cat pet = new Cat(petName, petDescription);
					pets.admitPet(pet);
				} else if (typeOfPet.equals("3")) {
					RobotDog pet = new RobotDog(petName, petDescription);
					pets.admitPet(pet);
				} else if (typeOfPet.equals("4")) {
					RobotCat pet = new RobotCat(petName, petDescription);
					pets.admitPet(pet);
				} else {
					System.out.println("Invalid input.");
					System.out.println("Please try again.");
				}
				System.out.println("Thank you for admitting " + petName);
			} else if (answer.equals("9")) {
				System.out.println("You cleaned the dog cages!");
				System.out.println("The dogs love you!");
				pets.cleanDogCages();
			} else if (answer.equals("10")) {
				System.out.println("You emptied the litter box!");
				System.out.println("The cats love you!");
				pets.cleanLitterBox();
			} else if (!answer.equals("0")) {
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