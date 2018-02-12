package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> shelter = new HashMap<>();
	private String litterBoxStatus;

	public Collection<VirtualPet> petList() {
		return shelter.values();
	}

	public void admitPet(VirtualPet newPet) {
		shelter.put(newPet.getName(), newPet);
	}

	public VirtualPet findPet(String petName) {
		return shelter.get(petName);
	}

	public void adoptPet(String petName) {
		shelter.remove(petName);
	}

	public void feedAllOrganicPets() {
		for (VirtualPet pets : shelter.values()) {
			if (pets instanceof Organic) {
				((Organic) pets).feedPet();
			}
		}
	}

	public void waterAllOrganicPets() {
		for (VirtualPet pets : shelter.values()) {
			if (pets instanceof Organic) {
				((Organic) pets).waterPet();
			}
		}
	}

	public void playWithAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.playWithPet();
		}
	}

	public void playWithOnePet(String petName) {
		for (VirtualPet pets : shelter.values()) {
			if (pets.getName().equals(petName)) {
				pets.playWithPet();
			}
		}
	}

	public void tickAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.tick();
		}
	}

	public void oilAllRobots() {
		for (VirtualPet pets : shelter.values()) {
			if (pets instanceof Robot) {
				((Robot) pets).oilPet();
			}
		}
	}

	public void walkAllDogs() {
		for (VirtualPet pets : shelter.values()) {
			if (pets instanceof Walkable) {
				((Walkable) pets).walkDog();
			}
		}

	}

	public void cleanLitterBox() {
		for (VirtualPet pets : shelter.values()) {
			if (pets instanceof Cat) {
				((Cat) pets).cleanLitterBoxes();
			}
		}
	}

	public void cleanDogCages() {
		for (VirtualPet pets : shelter.values()) {
			if (pets instanceof Dog) {
				((Dog) pets).cleanCage();
			}
		}
	}

	public String getLitterBoxStatus() {
		for (VirtualPet pets : shelter.values()) {
			if (((Cat) pets).getWasteLevel() > 0) {
				litterBoxStatus = "Dirty";
			} else {
				litterBoxStatus = "Clean";
			}
		}
		return litterBoxStatus;
	}
}