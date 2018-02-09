package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> shelter = new HashMap<>();

	public void admitPet(VirtualPet newPet) {
		shelter.put(newPet.getName(), newPet);
	}

	public VirtualPet findPet(String petName) {
		return shelter.get(petName);
	}

	public Collection<VirtualPet> petList() {
		return shelter.values();
	}

	public void adoptPet(String petName) {
		shelter.remove(petName);
	}

	public void feedAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.feedPet();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pets : shelter.values()) {
			pets.waterPet();
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
}
