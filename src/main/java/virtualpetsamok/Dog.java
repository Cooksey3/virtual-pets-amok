package virtualpetsamok;

public class Dog extends Organic implements Walkable {

	private String cageCleanliness;

	public Dog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel, int wasteLevel, String cageCleanliness) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel, wasteLevel);
		this.cageCleanliness = cageCleanliness;
	}

	public Dog(String petName, String petDescription) {
		super(petName, petDescription);
	}

	@Override
	public void walkDog() {
		wasteLevel -= 3;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public String getCageCleanliness() {
		if (wasteLevel < 5) {
			cageCleanliness = "Clean";
		} else {
			cageCleanliness = "Dirty";
		}
		return cageCleanliness;
	}

	public void cleanCage() {
		wasteLevel = 0;
		healthLevel += 6;
	}

	@Override
	public String toString() {
		return petName + "\t|" + hungerLevel + "\t|" + thirstLevel + "\t|\t|" + boredomLevel + "\t|" + getHealthLevel()
				+ "\t|" + getHappinessLevel() + "\t|" + wasteLevel + "\t|" + getCageCleanliness() + "\t|";
	}
}
