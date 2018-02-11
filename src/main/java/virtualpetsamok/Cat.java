package virtualpetsamok;

public class Cat extends Organic {

	public Cat(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel, int wasteLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel, wasteLevel);
	}

	public Cat(String petName, String petDescription) {
		super(petName, petDescription);
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public void cleanLitterBoxes() {
		wasteLevel = 0;
	}
}