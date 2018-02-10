package virtualpetsamok;

public abstract class Organic extends VirtualPet {

	public Organic(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel);
	}

	public Organic(String petName, String petDescription) {
		super(petName, petDescription);
	}

	public int getHunger() {
		return hungerLevel;
	}

	public int getThirst() {
		return thirstLevel;
	}

	public void feedPet() {
		hungerLevel -= 1;
	}

	public void waterPet() {
		thirstLevel -= 1;
	}

	public int getBoredom() {
		return boredomLevel;
	}

	public void playWithPet() {
		boredomLevel -= 1;
	}

	public int getHealthLevel() {
		healthLevel = boredomLevel + thirstLevel + hungerLevel;
		return healthLevel;
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}
}
